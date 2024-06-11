package com.example.parkiteasy_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLotOwnerPojo {
    private int ownerId;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;
    private String ownerPhn;

}
