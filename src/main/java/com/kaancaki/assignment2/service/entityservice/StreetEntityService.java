package com.kaancaki.assignment2.service.entityservice;

import com.kaancaki.assignment2.dao.StreetDao;
import com.kaancaki.assignment2.entity.Street;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreetEntityService {

    private final StreetDao streetDao;

    public Street save(Street street){
        return streetDao.save(street);
    }

    public Street updateStreetName(Long id, String name){

        Optional<Street> optionalStreet = streetDao.findById(id);

        Street street;
        if (optionalStreet.isPresent()){
             street = optionalStreet.get();
        } else {
            throw new RuntimeException("Itm Not Found!");
        }

        street.setName(name);

        return streetDao.save(street);
    }
}
