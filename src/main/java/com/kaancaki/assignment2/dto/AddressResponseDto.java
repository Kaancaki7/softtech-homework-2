package com.kaancaki.assignment2.dto;

import lombok.Data;

@Data
public class AddressResponseDto {

    private Long id;
    private Long countryId;

    private Long cityId;

    private Long districtId;

    private Long neighborhoodId;

    private Long streetId;

    private String doorNumber;

    private String apartmentNumber;
}
