package com.example.parkiteasy_backend.pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationPojo {
    private int reservationId;
    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;
    private String reservationStatus;
    private String vehicleType;
    private int parkingLotId;
    private int customerId;
}
