package com.example.demomvc.API;

import com.example.demomvc.Entity.Bill;
import com.example.demomvc.Repository.BillRepository;
import com.example.demomvc.Service.Impl.BillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api-bill")
public class BillAPI {
    @Autowired
    private BillRepository billRepository;
    @Autowired
    private BillServiceImpl billServiceImpl;

    @GetMapping("/getInformation")
    public ResponseEntity<?> doGetInformation() {
        Map<String, Object> result = new HashMap<>();
        try {
            result.put("message", "Hello World");
            result.put("status", true);
            result.put("data", billRepository.findAll());
        }catch (Exception e){
            result.put("message", "Hello World");
            result.put("status", false);
            result.put("data", null);
            System.out.println(e);
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/postInformation")
    public ResponseEntity<?> doPostInformation(@RequestBody Bill bill) {
        Map<String, Object> result = new HashMap<>();
        try {
            result.put("message", "Hello World");
            result.put("status", true);
            result.put("data", billServiceImpl.doSaveBill(bill));
        }catch (Exception e){
            result.put("message", "Hello World");
            result.put("status", false);
            result.put("data", null);
            System.out.println(e);
        }
        return ResponseEntity.ok(result);
    }
}
