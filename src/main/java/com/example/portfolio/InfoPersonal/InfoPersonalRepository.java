package com.example.portfolio.InfoPersonal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoPersonalRepository extends JpaRepository <infoPersonal, Long> {
}
