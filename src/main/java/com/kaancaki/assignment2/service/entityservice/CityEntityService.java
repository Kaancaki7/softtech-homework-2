package com.kaancaki.assignment2.service.entityservice;

import com.kaancaki.assignment2.dao.CityDao;
import com.kaancaki.assignment2.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityEntityService {

    private final CityDao cityDao;

    public City save(City city){
        return cityDao.save(city);
    }

    public City findByPlateCode(String plateCode){
        return cityDao.findByPlateCode(plateCode);
    }
}
