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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reservation_sequence_gen")
    @SequenceGenerator(name = "reservation_sequence_gen", sequenceName = "reservation_sequence", allocationSize = 1)
    private Integer id;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_vehicle_no", referencedColumnName = "id",
            foreignKey = @ForeignKey(name="fk_reservation_customer"))
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lot_id",  referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_reservation_parking_lot"))
    private ParkingLot parkingLot;

}
