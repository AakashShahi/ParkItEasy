package com.example.parkiteasy_backend.controller;

import com.example.parkiteasy_backend.entity.Receipt;
import com.example.parkiteasy_backend.pojo.ReceiptPojo;
import com.example.parkiteasy_backend.service.ReceiptService;
import com.example.parkiteasy_backend.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receipt")
@RequiredArgsConstructor
public class ReceiptController {

    private final ReceiptService receiptService;

    @PostMapping
    public ResponseEntity<GlobalApiResponse<Receipt>> createReceipt(@RequestBody ReceiptPojo receiptPojo) {
        Receipt newReceipt = receiptService.createReceipt(receiptPojo);
        GlobalApiResponse<Receipt> response = GlobalApiResponse.<Receipt>builder()
                .message("Receipt created successfully")
                .statusCode(HttpStatus.CREATED.value())
                .data(newReceipt)
                .build();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<GlobalApiResponse<List<Receipt>>> getAllReceipts() {
        List<Receipt> receipts = receiptService.getAllReceipts();
        GlobalApiResponse<List<Receipt>> response = GlobalApiResponse.<List<Receipt>>builder()
                .message("Receipts retrieved successfully")
                .statusCode(HttpStatus.OK.value())
                .data(receipts)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}