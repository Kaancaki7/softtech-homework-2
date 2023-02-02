package com.kaancaki.assignment2.controller;

import com.kaancaki.assignment2.dto.AddressResponseDto;
import com.kaancaki.assignment2.dto.AddressSaveRequestDto;
import com.kaancaki.assignment2.entity.*;
import com.kaancaki.assignment2.service.entityservice.*;
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
    private final NeighborhoodEntityService neighborhoodEntityService;
    private final StreetEntityService streetEntityService;
    private final AddressEntityService addressEntityService;
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

    @PostMapping("/neighborhoods")
    public ResponseEntity save(@RequestBody Neighborhood neighborhood){

         neighborhood = neighborhoodEntityService.save(neighborhood);

         return ResponseEntity.ok(neighborhood);
    }

    @PatchMapping("/neighborhoods")
    public ResponseEntity updateNeighborhoodName(@RequestParam Long id,@RequestParam String name){

        Neighborhood neighborhood = neighborhoodEntityService.updateNeighborhoodName(id, name);

        return ResponseEntity.ok(neighborhood);
    }

    @GetMapping("/neighborhoods/{districtId}")
    public ResponseEntity findAllNeighborhoods(@PathVariable Long districtId){

        List<Neighborhood> neighborhoodList = neighborhoodEntityService.findAllByDistrictId(districtId);

        return ResponseEntity.ok(neighborhoodList);
    }

    @PostMapping("/streets")
    public ResponseEntity save(@RequestBody Street street){

        street = streetEntityService.save(street);

        return ResponseEntity.ok(street);
    }

    @PatchMapping("/streets")
    public ResponseEntity updateStreetName(@RequestParam Long id,@RequestParam String name){

        Street street = streetEntityService.updateStreetName(id, name);

        return ResponseEntity.ok(street);
    }

    @GetMapping("/streets/{neighborhoodId}")
    public ResponseEntity findAllStreets(@PathVariable Long neighborhoodId){

        List<Street> streetList = streetEntityService.findAllByNeighborhoodId(neighborhoodId);

        return ResponseEntity.ok(streetList);
    }

    @PostMapping()
    public ResponseEntity save(@RequestBody AddressSaveRequestDto addressSaveRequestDto){

        AddressResponseDto addressResponseDto = addressEntityService.save(addressSaveRequestDto);

        return ResponseEntity.ok(addressResponseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        addressEntityService.delete(id);

        return ResponseEntity.ok(Void.TYPE);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){

        AddressResponseDto addressResponseDto = addressEntityService.findById(id);

        return ResponseEntity.ok(addressResponseDto);
    }
}
