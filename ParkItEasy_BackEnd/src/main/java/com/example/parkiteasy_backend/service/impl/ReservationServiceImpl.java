package com.example.parkiteasy_backend.service.impl;

import com.example.parkiteasy_backend.entity.Reservation;
import com.example.parkiteasy_backend.pojo.ReservationPojo;
import com.example.parkiteasy_backend.repository.ReservationRepository;
import com.example.parkiteasy_backend.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(ReservationPojo reservationPojo) {
        Reservation reservation = new Reservation();
        reservation.setVehicleType(reservationPojo.getVehicleType());
        reservation.setStartDate(reservationPojo.getStartDate());
        reservation.setEndDate(reservationPojo.getEndDate());
        reservation.setStartTime(reservationPojo.getStartTime());
        reservation.setEndTime(reservationPojo.getEndTime());
        reservation.setStatus(reservationPojo.getReservationStatus());
        reservationRepository.save(reservation);
        return reservation;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        if(reservationRepository.findById(id).isPresent()){
            return reservationRepository.findById(id).get();
        }
        else{
            return null;
        }
    }

    @Override
    public Reservation updateReservation(Long id,ReservationPojo reservationPojo) {
        Optional<Reservation> reservation= reservationRepository.findById(id);
        if(reservation.isPresent()){
            Reservation reservation1 = reservation.get();
            reservation1.setVehicleType(reservationPojo.getVehicleType());
            reservation1.setStartDate(reservationPojo.getStartDate());
            reservation1.setEndDate(reservationPojo.getEndDate());
            reservation1.setStartTime(reservationPojo.getStartTime());
            reservation1.setEndTime(reservationPojo.getEndTime());
            reservation1.setStatus(reservationPojo.getReservationStatus());
            reservationRepository.save(reservation1);
            return reservation1;
        }
        else{
            return null;
        }
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
