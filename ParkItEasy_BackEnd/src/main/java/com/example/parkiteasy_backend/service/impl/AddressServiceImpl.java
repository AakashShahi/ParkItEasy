package com.example.parkiteasy_backend.service.impl;

import com.example.parkiteasy_backend.entity.Address;
import com.example.parkiteasy_backend.pojo.AddressPojo;
import com.example.parkiteasy_backend.repository.AddressRepository;
import com.example.parkiteasy_backend.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public Address addAddress(AddressPojo addressPojo) {
        Address address = new Address();
        address.setStreet(addressPojo.getStreet());
        address.setCity(addressPojo.getCity());
        address.setState(addressPojo.getState());
        address.setZipcode(addressPojo.getZip());
        addressRepository.save(address);
        return address;
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Long id) {
       return addressRepository.findById(id).orElse(null);
    }

    @Override
    public Address updateAddressById(Long id,AddressPojo addressPojo) {
        Optional<Address> address = addressRepository.findById(id);
        if (address.isPresent()) {
            address.get().setStreet(addressPojo.getStreet());
            address.get().setCity(addressPojo.getCity());
            address.get().setState(addressPojo.getState());
            address.get().setZipcode(addressPojo.getZip());
            return addressRepository.save(address.get());
        }
        else{
            return null;
        }
    }

    @Override
    public void deleteAddressById(Long id) {
        addressRepository.deleteById(id);
    }


}
