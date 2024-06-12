package com.example.parkiteasy_backend.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "receipts")
@Getter
@Setter
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoice_id_generator")
    @SequenceGenerator(name="invoice_id_generator", sequenceName = "receipt_seq", allocationSize=1)
    private Long invoiceId;

    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "date")
    private Date date;

    @Column(name = "payment_method", length = 10)
    private String paymentMethod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_receipt_reservation"))
    private Reservation reservation;
}
