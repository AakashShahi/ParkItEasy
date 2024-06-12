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
    private Long id;
    private String street;
    private String city;
    private String state;
    private int zip;
}
