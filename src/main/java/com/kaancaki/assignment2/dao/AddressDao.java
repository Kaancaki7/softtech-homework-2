package com.kaancaki.assignment2.dao;

import com.kaancaki.assignment2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends JpaRepository<Address, Long> {


}
