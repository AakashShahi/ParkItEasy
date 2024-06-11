package com.example.parkiteasy_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReceiptPojo {
    private int invoiceId;
    private BigDecimal totalPrice;
    private Date date;
    private String paymentMethod;
    private int reservationId;
}
