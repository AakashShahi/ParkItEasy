package com.example.parkiteasy_backend.repository;

import com.example.parkiteasy_backend.entity.ParkingLotOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotOwnerRepository extends JpaRepository<ParkingLotOwner, Long> {
}
