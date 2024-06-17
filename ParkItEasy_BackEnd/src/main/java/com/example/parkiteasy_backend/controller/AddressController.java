package com.example.parkiteasy_backend.controller;


import com.example.parkiteasy_backend.entity.Address;
import com.example.parkiteasy_backend.pojo.AddressPojo;
import com.example.parkiteasy_backend.service.AddressService;
import com.example.parkiteasy_backend.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public ResponseEntity<GlobalApiResponse<Address>> addAddress(@RequestBody AddressPojo addressPojo) {
        Address newAddress = addressService.addAddress(addressPojo);
        GlobalApiResponse<Address> response = GlobalApiResponse.<Address>builder()
                .message("Address created successfully")
                .statusCode(HttpStatus.CREATED.value())
                .data(newAddress)
                .build();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<GlobalApiResponse<List<Address>>> getAllAddresses() {
        List<Address> addresses = addressService.getAllAddress();
        GlobalApiResponse<List<Address>> response = GlobalApiResponse.<List<Address>>builder()
                .message("Addresses retrieved successfully")
                .statusCode(HttpStatus.OK.value())
                .data(addresses)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<Address>> getAddressById(@PathVariable Long id) {
        Address address = addressService.getAddressById(id);
        if (address == null) {
            GlobalApiResponse<Address> response = GlobalApiResponse.<Address>builder()
                    .message("Address not found")
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .data(null)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        GlobalApiResponse<Address> response = GlobalApiResponse.<Address>builder()
                .message("Address retrieved successfully")
                .statusCode(HttpStatus.OK.value())
                .data(address)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<Address>> updateAddressById(@PathVariable Long id, @RequestBody AddressPojo addressPojo) {
        Address updatedAddress = addressService.updateAddressById(id, addressPojo);
        if (updatedAddress == null) {
            GlobalApiResponse<Address> response = GlobalApiResponse.<Address>builder()
                    .message("Address not found")
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .data(null)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        GlobalApiResponse<Address> response = GlobalApiResponse.<Address>builder()
                .message("Address updated successfully")
                .statusCode(HttpStatus.OK.value())
                .data(updatedAddress)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<Void>> deleteAddressById(@PathVariable Long id) {
        addressService.deleteAddressById(id);
        GlobalApiResponse<Void> response = GlobalApiResponse.<Void>builder()
                .message("Address deleted successfully")
                .statusCode(HttpStatus.NO_CONTENT.value())
                .data(null)
                .build();
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }
}
