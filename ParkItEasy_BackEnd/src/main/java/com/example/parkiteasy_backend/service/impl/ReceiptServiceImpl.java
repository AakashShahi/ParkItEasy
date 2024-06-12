package com.example.parkiteasy_backend.service.impl;

import com.example.parkiteasy_backend.entity.Receipt;
import com.example.parkiteasy_backend.pojo.ReceiptPojo;
import com.example.parkiteasy_backend.repository.ReceiptRepository;
import com.example.parkiteasy_backend.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReceiptServiceImpl implements ReceiptService {

    private final ReceiptRepository receiptRepository;

    @Override
    public Receipt createReceipt(ReceiptPojo receiptPojo) {
        Receipt receipt = new Receipt();
        receipt.setDate(receiptPojo.getDate());
        receipt.setAmount(receiptPojo.getTotalPrice());
        receipt.setPaymentMethod(receiptPojo.getPaymentMethod());
        receiptRepository.save(receipt);
        return receipt;
    }

    @Override
    public List<Receipt> getAllReceipts() {
       return receiptRepository.findAll();
    }
}
