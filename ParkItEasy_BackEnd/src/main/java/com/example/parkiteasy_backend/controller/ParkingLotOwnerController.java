package com.example.parkiteasy_backend.controller;

import com.example.parkiteasy_backend.entity.ParkingLotOwner;
import com.example.parkiteasy_backend.pojo.ParkingLotOwnerPojo;
import com.example.parkiteasy_backend.service.ParkingLotOwnerService;
import com.example.parkiteasy_backend.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parking-lot-owners")
@RequiredArgsConstructor
public class ParkingLotOwnerController {

    private final ParkingLotOwnerService parkingLotOwnerService;

    @PostMapping
    public ResponseEntity<GlobalApiResponse<ParkingLotOwner>> createParkingLotOwner(@RequestBody ParkingLotOwnerPojo parkingLotOwnerPojo) {
        ParkingLotOwner newOwner = parkingLotOwnerService.createParkingLotOwner(parkingLotOwnerPojo);
        GlobalApiResponse<ParkingLotOwner> response = GlobalApiResponse.<ParkingLotOwner>builder()
                .message("Parking lot owner created successfully")
                .statusCode(HttpStatus.CREATED.value())
                .data(newOwner)
                .build();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<ParkingLotOwner>> updateParkingLotOwner(@PathVariable Long id, @RequestBody ParkingLotOwnerPojo parkingLotOwnerPojo) {
        ParkingLotOwner updatedOwner = parkingLotOwnerService.updateParkingLotOwner(id, parkingLotOwnerPojo);
        if (updatedOwner == null) {
            GlobalApiResponse<ParkingLotOwner> response = GlobalApiResponse.<ParkingLotOwner>builder()
                    .message("Parking lot owner not found with id " + id)
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .data(null)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        GlobalApiResponse<ParkingLotOwner> response = GlobalApiResponse.<ParkingLotOwner>builder()
                .message("Parking lot owner updated successfully")
                .statusCode(HttpStatus.OK.value())
                .data(updatedOwner)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<Void>> deleteParkingLotOwner(@PathVariable Long id) {
        parkingLotOwnerService.deleteParkingLotOwnerById(id);
        GlobalApiResponse<Void> response = GlobalApiResponse.<Void>builder()
                .message("Parking lot owner deleted successfully")
                .statusCode(HttpStatus.NO_CONTENT.value())
                .data(null)
                .build();
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }
}
