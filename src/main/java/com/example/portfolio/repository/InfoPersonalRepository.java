package com.example.portfolio.repository;

import com.example.portfolio.model.infoPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoPersonalRepository extends JpaRepository <infoPersonal, Long> {
}
