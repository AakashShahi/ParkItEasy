package com.example.parkiteasy_backend.service;

import com.example.parkiteasy_backend.entity.Address;
import com.example.parkiteasy_backend.pojo.AddressPojo;

import java.util.List;
import java.util.Optional;

public interface AddressService {
 Address addAddress(AddressPojo addressPojo);
 List<Address> getAllAddress();
 Address getAddressById(Long id);
 Address updateAddressById(Long id,AddressPojo addressPojo);
 void deleteAddressById(Long id);
}
