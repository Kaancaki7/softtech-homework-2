package com.kaancaki.assignment2.converter;

import com.kaancaki.assignment2.dto.AddressResponseDto;
import com.kaancaki.assignment2.dto.AddressSaveRequestDto;
import com.kaancaki.assignment2.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressSaveRequestDto addressSaveRequestDto);

    AddressResponseDto convertToAddressResponseDto(Address address);
}
