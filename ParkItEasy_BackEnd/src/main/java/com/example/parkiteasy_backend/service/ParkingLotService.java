package com.example.parkiteasy_backend.service;

import com.example.parkiteasy_backend.entity.ParkingLot;
import com.example.parkiteasy_backend.pojo.ParkingLotPojo;

import java.util.List;

public interface ParkingLotService {
    ParkingLot addParkingLot(ParkingLotPojo parkingLotPojo);
    List<ParkingLot> getParkingLots();
    ParkingLot getParkingLot(Long parkingLotId);
    ParkingLot updateParkingLot(Long parkingLotId,ParkingLotPojo parkingLotPojo);

}
