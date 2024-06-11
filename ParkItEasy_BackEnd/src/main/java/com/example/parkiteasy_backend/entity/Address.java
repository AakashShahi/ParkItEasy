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
@Table(name = "addresses")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_id_generator")
    @SequenceGenerator(name="address_id_generator", sequenceName = "address_seq", allocationSize=1)
    private Integer id;

    @Column(name = "street", length = 20)
    private String street;

    @Column(name = "city", length = 20)
    private String city;

    @Column(name = "state", length = 20)
    private String state;

    @Column(name = "zipcode", length = 8)
    private Integer zipcode;
}
