package com.kaancaki.assignment2.dao;

import com.kaancaki.assignment2.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetDao extends JpaRepository<Street, Long> {


}
