package com.example.parkiteasy_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer{
    @Id
    @Column(name = "vehicle_no", length = 10)
    private Integer vehicleNumber;

    @Column(name = "full_name", length = 50)
    private String fullName;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 20)
    private String password;

    @Column(name = "phone_no", length = 15)
    private String phoneNumber;

}
