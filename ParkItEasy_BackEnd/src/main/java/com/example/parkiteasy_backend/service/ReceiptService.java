package com.example.parkiteasy_backend.service;

import com.example.parkiteasy_backend.entity.Receipt;
import com.example.parkiteasy_backend.pojo.ReceiptPojo;

import java.util.List;

public interface ReceiptService {
    Receipt createReceipt(ReceiptPojo receiptPojo);
    List<Receipt> getAllReceipts();
}
