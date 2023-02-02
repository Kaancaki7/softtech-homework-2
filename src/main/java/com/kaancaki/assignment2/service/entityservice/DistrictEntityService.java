package com.kaancaki.assignment2.service.entityservice;

import com.kaancaki.assignment2.dao.DistrictDao;
import com.kaancaki.assignment2.entity.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class DistrictEntityService {

    private final DistrictDao districtDao;

    public District save(District district){
        return districtDao.save(district);
    }

    public List<District> findByAllCityId(Long cityId){
        return districtDao.findAllByCityId(cityId);
    }
}
