package com.example.parkiteasy_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressPojo {
    private int id;
    private String street;
    private String city;
    private String state;
    private String zip;
}
