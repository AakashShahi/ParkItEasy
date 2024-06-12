package com.example.parkiteasy_backend.service.impl;

import com.example.parkiteasy_backend.entity.ParkingLot;
import com.example.parkiteasy_backend.pojo.ParkingLotPojo;
import com.example.parkiteasy_backend.repository.ParkingLotRepository;
import com.example.parkiteasy_backend.service.ParkingLotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParkingLotServiceImpl implements ParkingLotService {

    private final ParkingLotRepository parkingLotRepository;

    @Override
    public ParkingLot addParkingLot(ParkingLotPojo parkingLotPojo) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setLotName(parkingLotPojo.getLotName());
        parkingLot.setPrice(parkingLotPojo.getPrice());
        parkingLot.setStatus(parkingLotPojo.getStatus());
        parkingLot.setCapacity(parkingLotPojo.getCapacity());
        parkingLotRepository.save(parkingLot);
        return parkingLot;
    }

    @Override
    public List<ParkingLot> getParkingLots() {
       return parkingLotRepository.findAll();
    }

    @Override
    public ParkingLot getParkingLot(Long parkingLotId) {
        if (parkingLotRepository.findById(parkingLotId).isPresent()) {
            return parkingLotRepository.findById(parkingLotId).get();
        }
        return null;
    }

    @Override
    public ParkingLot updateParkingLot(Long parkingLotId, ParkingLot parkingLot) {
       Optional<ParkingLot> parkinglot= parkingLotRepository.findById(parkingLotId);
       if (parkinglot.isPresent()) {
           parkinglot.get().setLotName(parkingLot.getLotName());
           parkinglot.get().setPrice(parkingLot.getPrice());
           parkinglot.get().setStatus(parkingLot.getStatus());
           parkinglot.get().setCapacity(parkingLot.getCapacity());
           parkingLotRepository.save(parkinglot.get());
           return parkinglot.get();
       }
       else{
           return null;
       }
    }
}
