package com.example.parkiteasy_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "parking_lot_owners")
@Getter
@Setter
public class ParkingLotOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "owner_id_generator")
    @SequenceGenerator(name="owner_id_generator", sequenceName = "parking_lot_owner_seq", allocationSize=1)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "phone_no", length = 15)
    private String phoneNo;
}
