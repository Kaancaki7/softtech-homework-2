package com.kaancaki.assignment2.dao;

import com.kaancaki.assignment2.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictDao extends JpaRepository<District, Long> {


}
