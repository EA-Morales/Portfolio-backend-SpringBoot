package com.example.portfolio.repository;

import com.example.portfolio.model.aboutMe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface aboutMeRepository extends JpaRepository<aboutMe, Long> {

}
