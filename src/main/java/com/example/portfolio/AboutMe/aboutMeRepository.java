package com.example.portfolio.AboutMe;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface aboutMeRepository extends JpaRepository<aboutMe, Long> {

}
