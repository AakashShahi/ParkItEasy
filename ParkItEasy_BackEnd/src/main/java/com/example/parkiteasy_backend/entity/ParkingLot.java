package com.example.parkiteasy_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "parking_lots")
@Getter
@Setter
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lot_id_generator")
    @SequenceGenerator(name="lot_id_generator", sequenceName = "parking_lot_seq", allocationSize=1)
    private Integer id;

    @Column(name = "lot_name", length = 50)
    private String lotName;

    @Column(name = "capacity", length = 10)
    private Integer capacity;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "status", length = 20)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_parking_lot_owner"))
    private ParkingLotOwner owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_parking_lot_address"))
    private Address address;
}
