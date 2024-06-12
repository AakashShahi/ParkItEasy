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
    private Long id;
    private String lotName;
    private int capacity;
    private BigDecimal price;
    private String status;
    private Long ownerId;
    private Long addressId;

}
