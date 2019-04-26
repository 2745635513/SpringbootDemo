package com.frs.repository;

import com.frs.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
