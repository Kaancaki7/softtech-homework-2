package com.kaancaki.assignment2.service.entityservice;

import com.kaancaki.assignment2.dao.NeighborhoodDao;
import com.kaancaki.assignment2.entity.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NeighborhoodEntityService {

    private final NeighborhoodDao neighborhoodDao;

    public Neighborhood save(Neighborhood neighborhood){
        return neighborhoodDao.save(neighborhood);
    }

    public Neighborhood updateNeighborhoodName(Long id,String name){
        Optional<Neighborhood> neighborhoodOptional = neighborhoodDao.findById(id);

        Neighborhood neighborhood;
        if (neighborhoodOptional.isPresent()){
            neighborhood = neighborhoodOptional.get();
        } else {
            throw new RuntimeException("Item Not Found!");
        }

        neighborhood.setName(name);

        return neighborhoodDao.save(neighborhood);
    }

    public List<Neighborhood> findAllByDistrictId(Long districtId){
        return neighborhoodDao.findAllByDistrictId(districtId);
    }
}
