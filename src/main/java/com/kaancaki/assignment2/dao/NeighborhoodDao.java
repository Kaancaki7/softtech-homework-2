package com.kaancaki.assignment2.dao;

import com.kaancaki.assignment2.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodDao extends JpaRepository<Neighborhood, Long> {


}
