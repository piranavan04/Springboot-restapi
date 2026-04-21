package com.spring.restapi.service.impl;

import com.spring.restapi.entity.Address;
import com.spring.restapi.repository.AddressRepository;
import com.spring.restapi.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public Address updateAddress(Long id, Address address) {
        Address existingAddress = addressRepository.findById(address.getId()).orElse(null);
        if (existingAddress != null) {
            existingAddress.setCountry(address.getCountry());
            existingAddress.setCity(address.getCity());

        }
        return addressRepository.save(existingAddress);
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);

    }
}
