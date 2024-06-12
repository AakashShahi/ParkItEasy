package com.example.parkiteasy_backend.service;

import com.example.parkiteasy_backend.entity.ParkingLotOwner;
import com.example.parkiteasy_backend.pojo.ParkingLotOwnerPojo;

public interface ParkingLotOwnerService {
    ParkingLotOwner createParkingLotOwner(ParkingLotOwnerPojo parkingLotOwnerPojo);
    void deleteParkingLotOwnerById(Long parkingLotOwnerId);
    ParkingLotOwner updateParkingLotOwner(Long id,ParkingLotOwnerPojo parkingLotOwnerPojo);
}
