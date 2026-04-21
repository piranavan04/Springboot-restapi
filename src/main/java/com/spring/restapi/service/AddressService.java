package com.spring.restapi.service;

import com.spring.restapi.entity.Address;

import java.util.List;

public interface AddressService {

    //CREATE
    Address saveAddress(Address address);

    //READ
    List<Address> getAddress(Long id);

    //READ ONE BY ID
    Address getAddressById(Long id);

    //UPDATE
    Address updateAddress(Long id, Address address);

    //DELETE
    void deleteAddress(Long id);

}
