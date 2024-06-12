package com.example.parkiteasy_backend.service.impl;

import com.example.parkiteasy_backend.entity.ParkingLotOwner;
import com.example.parkiteasy_backend.pojo.ParkingLotOwnerPojo;
import com.example.parkiteasy_backend.repository.ParkingLotOwnerRepository;
import com.example.parkiteasy_backend.service.ParkingLotOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParkingLotOwnerServiceImpl implements ParkingLotOwnerService {

    private final ParkingLotOwnerRepository parkingLotOwnerRepository;

    @Override
    public ParkingLotOwner createParkingLotOwner(ParkingLotOwnerPojo parkingLotOwnerPojo) {
        ParkingLotOwner parkingLotOwner = new ParkingLotOwner();
        parkingLotOwner.setName(parkingLotOwnerPojo.getOwnerName());
        parkingLotOwner.setEmail(parkingLotOwnerPojo.getOwnerEmail());
        parkingLotOwner.setPhoneNo(parkingLotOwnerPojo.getOwnerPhone());
        parkingLotOwner.setPassword(parkingLotOwnerPojo.getOwnerPass());
        parkingLotOwnerRepository.save(parkingLotOwner);
        return parkingLotOwner;
    }

    @Override
    public void deleteParkingLotOwnerById(Long parkingLotOwnerId) {
        parkingLotOwnerRepository.deleteById(parkingLotOwnerId);
    }

    @Override
    public ParkingLotOwner updateParkingLotOwner(Long id,ParkingLotOwnerPojo parkingLotOwnerPojo) {
        Optional<ParkingLotOwner> parkingLotOwner= parkingLotOwnerRepository.findById(id);
        if(parkingLotOwner.isPresent()){
            parkingLotOwner.get().setName(parkingLotOwnerPojo.getOwnerName());
            parkingLotOwner.get().setEmail(parkingLotOwnerPojo.getOwnerEmail());
            parkingLotOwner.get().setPhoneNo(parkingLotOwnerPojo.getOwnerPhone());
            parkingLotOwner.get().setPassword(parkingLotOwnerPojo.getOwnerPass());
            return parkingLotOwnerRepository.save(parkingLotOwner.get());
        }
        else{
            return null;
        }
    }
}
