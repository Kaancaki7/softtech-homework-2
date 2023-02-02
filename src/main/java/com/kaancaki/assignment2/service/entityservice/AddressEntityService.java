package com.kaancaki.assignment2.service.entityservice;

import com.kaancaki.assignment2.converter.AddressMapper;
import com.kaancaki.assignment2.dao.AddressDao;
import com.kaancaki.assignment2.dto.AddressResponseDto;
import com.kaancaki.assignment2.dto.AddressSaveRequestDto;
import com.kaancaki.assignment2.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressEntityService {

    private final AddressDao addressDao;

    public AddressResponseDto save(AddressSaveRequestDto addressSaveRequestDto){

        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveRequestDto);

        addressDao.save(address);

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    public void delete(Long id){

        Optional<Address> optionalAddress = addressDao.findById(id);

        Address address;
        if (optionalAddress.isPresent()){
             address = optionalAddress.get();
             addressDao.delete(address);
        } else {
            throw new RuntimeException("Item Not Found!");
        }
    }

    public AddressResponseDto findById(Long id){
        Optional<Address> optionalAddress = addressDao.findById(id);
        Address address;
        if (optionalAddress.isPresent()){
            address = optionalAddress.get();
        } else {
            throw new RuntimeException("Item Not Found!");
        }

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }
}
