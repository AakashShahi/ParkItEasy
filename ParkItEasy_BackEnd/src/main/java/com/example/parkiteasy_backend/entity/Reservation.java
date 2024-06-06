package com.example.parkiteasy_backend.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "reservations")
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reservation_sequence")
    @SequenceGenerator(name = "reservation_sequence", sequenceName = "reservation_sequence", allocationSize = 1)
    @Column(name = "reservation_id", length = 10)
    private Integer reservationId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "start_time")
    private Time startTime;

    @Column(name = "end_time")
    private Time endTime;

    @Column(name = "status", length = 20)
    private String status;

    @Column(name = "vehicle_type", length = 15)
    private String vehicleType;

}
