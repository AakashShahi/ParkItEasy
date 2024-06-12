package com.example.parkiteasy_backend.service;

import com.example.parkiteasy_backend.entity.Reservation;
import com.example.parkiteasy_backend.pojo.ReservationPojo;

import java.util.List;

public interface ReservationService {
    Reservation createReservation(ReservationPojo reservationPojo);
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long id);
    Reservation updateReservation(Long id,ReservationPojo reservationPojo);
    void deleteReservation(Long id);
}
