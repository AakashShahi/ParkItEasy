package com.example.parkiteasy_backend.controller;

import com.example.parkiteasy_backend.entity.Reservation;
import com.example.parkiteasy_backend.pojo.ReservationPojo;
import com.example.parkiteasy_backend.service.ReservationService;
import com.example.parkiteasy_backend.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping
    public ResponseEntity<GlobalApiResponse<Reservation>> createReservation(@RequestBody ReservationPojo reservationPojo) {
        Reservation newReservation = reservationService.createReservation(reservationPojo);
        GlobalApiResponse<Reservation> response = GlobalApiResponse.<Reservation>builder()
                .message("Reservation created successfully")
                .statusCode(HttpStatus.CREATED.value())
                .data(newReservation)
                .build();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<GlobalApiResponse<List<Reservation>>> getAllReservations() {
        List<Reservation> reservations = reservationService.getAllReservations();
        GlobalApiResponse<List<Reservation>> response = GlobalApiResponse.<List<Reservation>>builder()
                .message("Reservations retrieved successfully")
                .statusCode(HttpStatus.OK.value())
                .data(reservations)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<?>> getReservationById(@PathVariable Long id) {
        Reservation reservation = reservationService.getReservationById(id);
        if (reservation != null) {
            GlobalApiResponse<Reservation> response = GlobalApiResponse.<Reservation>builder()
                    .message("Reservation retrieved successfully")
                    .statusCode(HttpStatus.OK.value())
                    .data(reservation)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            GlobalApiResponse<Void> response = GlobalApiResponse.<Void>builder()
                    .message("Reservation not found")
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .data(null)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<?>> updateReservation(@PathVariable Long id, @RequestBody ReservationPojo reservationPojo) {
        Reservation updatedReservation = reservationService.updateReservation(id, reservationPojo);
        if (updatedReservation != null) {
            GlobalApiResponse<Reservation> response = GlobalApiResponse.<Reservation>builder()
                    .message("Reservation updated successfully")
                    .statusCode(HttpStatus.OK.value())
                    .data(updatedReservation)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            GlobalApiResponse<Void> response = GlobalApiResponse.<Void>builder()
                    .message("Reservation not found")
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .data(null)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GlobalApiResponse<Void>> deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
        GlobalApiResponse<Void> response = GlobalApiResponse.<Void>builder()
                .message("Reservation deleted successfully")
                .statusCode(HttpStatus.NO_CONTENT.value())
                .data(null)
                .build();
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }
}