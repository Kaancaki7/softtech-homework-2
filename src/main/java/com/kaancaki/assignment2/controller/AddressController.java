package com.kaancaki.assignment2.controller;

import com.kaancaki.assignment2.entity.City;
import com.kaancaki.assignment2.entity.Country;
import com.kaancaki.assignment2.entity.District;
import com.kaancaki.assignment2.service.entityservice.CityEntityService;
import com.kaancaki.assignment2.service.entityservice.CountryEntityService;
import com.kaancaki.assignment2.service.entityservice.DistrictEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final CountryEntityService countryEntityService;
    private final CityEntityService cityEntityService;
    private final DistrictEntityService districtEntityService;
    @PostMapping("countries")
    public ResponseEntity save(@RequestBody Country country){

        country = countryEntityService.save(country);

        return ResponseEntity.ok(country);
    }

    @GetMapping("/countries/{code}")
    public ResponseEntity findByCountryCode(@PathVariable String code){

        Country country = countryEntityService.findByCountryCode(code);

        return ResponseEntity.ok(country);
    }

    @PostMapping("/cities")
    public ResponseEntity save(@RequestBody City city){

        city = cityEntityService.save(city);

        return ResponseEntity.ok(city);
    }

    @GetMapping("/cities/{plateCode}")
    public ResponseEntity findByPlateCode(@PathVariable String plateCode){

        City city = cityEntityService.findByPlateCode(plateCode);

        return ResponseEntity.ok(city);
    }

    @PostMapping("/districts")
    public ResponseEntity save(@RequestBody District district){

        district = districtEntityService.save(district);

        return ResponseEntity.ok(district);
    }

    @GetMapping("/districts/{cityId}")
    public ResponseEntity findAllByCityId(@PathVariable Long cityId){

        List<District> districtList = districtEntityService.findByAllCityId(cityId);

        return ResponseEntity.ok(districtList);
    }
}
