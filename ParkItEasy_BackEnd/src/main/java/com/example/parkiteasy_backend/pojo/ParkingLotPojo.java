package com.example.parkiteasy_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLotPojo {
    private int id;
    private String lotName;
    private int capacity;
    private BigDecimal price;
    private String status;
    private int ownerId;
    private int addressId;

}
