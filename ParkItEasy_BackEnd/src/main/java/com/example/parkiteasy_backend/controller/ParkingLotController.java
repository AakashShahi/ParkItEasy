package com.example.parkiteasy_backend.controller;

import com.example.parkiteasy_backend.entity.ParkingLot;
import com.example.parkiteasy_backend.pojo.ParkingLotPojo;
import com.example.parkiteasy_backend.service.ParkingLotService;
import com.example.parkiteasy_backend.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parking-lot")
@RequiredArgsConstructor
public class ParkingLotController {

    private final ParkingLotService parkingLotService;

    @PostMapping
    public ResponseEntity<GlobalApiResponse<ParkingLot>> addParkingLot(@RequestBody ParkingLotPojo parkingLotPojo) {
        ParkingLot newParkingLot = parkingLotService.addParkingLot(parkingLotPojo);
        GlobalApiResponse<ParkingLot> response = GlobalApiResponse.<ParkingLot>builder()
                .message("Parking lot created successfully")
                .statusCode(HttpStatus.CREATED.value())
                .data(newParkingLot)
                .build();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<GlobalApiResponse<List<ParkingLot>>> getParkingLots() {
        List<ParkingLot> parkingLots = parkingLotService.getParkingLots();
        GlobalApiResponse<List<ParkingLot>> response = GlobalApiResponse.<List<ParkingLot>>builder()
                .message("Parking lots retrieved successfully")
                .statusCode(HttpStatus.OK.value())
                .data(parkingLots)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<ParkingLot>> getParkingLot(@PathVariable Long id) {
        ParkingLot parkingLot = parkingLotService.getParkingLot(id);
        if (parkingLot == null) {
            GlobalApiResponse<ParkingLot> response = GlobalApiResponse.<ParkingLot>builder()
                    .message("Parking lot not found with id " + id)
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .data(null)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        GlobalApiResponse<ParkingLot> response = GlobalApiResponse.<ParkingLot>builder()
                .message("Parking lot retrieved successfully")
                .statusCode(HttpStatus.OK.value())
                .data(parkingLot)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<ParkingLot>> updateParkingLot(@PathVariable Long id, @RequestBody ParkingLotPojo parkingLotPojo) {
        ParkingLot updatedParkingLot = parkingLotService.updateParkingLot(id, parkingLotPojo);
        if (updatedParkingLot == null) {
            GlobalApiResponse<ParkingLot> response = GlobalApiResponse.<ParkingLot>builder()
                    .message("Parking lot not found with id " + id)
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .data(null)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        GlobalApiResponse<ParkingLot> response = GlobalApiResponse.<ParkingLot>builder()
                .message("Parking lot updated successfully")
                .statusCode(HttpStatus.OK.value())
                .data(updatedParkingLot)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

