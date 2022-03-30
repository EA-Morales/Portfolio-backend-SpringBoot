package com.example.portfolio.security.config;

import com.example.portfolio.security.filter.CustomAuthenticationFilter;
import com.example.portfolio.security.filter.CustomAuthorizationFilter;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors();
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(STATELESS);
        http.authorizeRequests().antMatchers("/login/**").permitAll();
        http.authorizeRequests().antMatchers(GET, "/api/user").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeRequests().antMatchers(GET, "/banner").permitAll();
        http.authorizeRequests().antMatchers(GET, "/descripcion").permitAll();
        http.authorizeRequests().antMatchers(GET, "/experiencia").permitAll();
        http.authorizeRequests().antMatchers(GET, "/educacion").permitAll();
        http.authorizeRequests().antMatchers(GET, "/skills").permitAll();
        http.authorizeRequests().antMatchers(GET, "/proyectos").permitAll();
        //http.authorizeRequests().antMatchers(GET, "/**").permitAll();
        http.authorizeRequests().antMatchers(POST, "/**").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeRequests().anyRequest().authenticated();
        http.addFilter(new CustomAuthenticationFilter(authenticationManagerBean()));
        http.addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}

// Permite solo los GET a /banner
// http.authorizeRequests().antMatchers(GET, "/banner").permitAll();

// Permite que pase all
// http.authorizeRequests().anyRequest().permitAll();

// Aplica el filtro antes de todo
// http.addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);

// Todos los filtros
// http.authorizeRequests().antMatchers("/login/**").permitAll();
// http.authorizeRequests().antMatchers(GET, "/**").permitAll();
// http.authorizeRequests().antMatchers(POST, "/**").hasAnyAuthority("ROLE_ADMIN");

//  http.authorizeRequests().antMatchers(GET, "/banner").permitAll();
//  http.authorizeRequests().antMatchers(GET, "/descripcion").permitAll();
//  http.authorizeRequests().antMatchers(GET, "/experiencia").permitAll();
//  http.authorizeRequests().antMatchers(GET, "/educacion").permitAll();
//  http.authorizeRequests().antMatchers(GET, "/skills").permitAll();
//  http.authorizeRequests().antMatchers(GET, "/proyectos").permitAll();