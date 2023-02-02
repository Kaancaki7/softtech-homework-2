package com.kaancaki.assignment2.dao;

import com.kaancaki.assignment2.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictDao extends JpaRepository<District, Long> {

    List<District> findAllByCityId(Long cityId);
}
