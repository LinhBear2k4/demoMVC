package com.example.demomvc.Service.Impl;

import com.example.demomvc.Entity.Bill;
import com.example.demomvc.Repository.BillRepository;
import com.example.demomvc.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;

    @Override
    public Bill doSaveBill(Bill bill) {
        if(bill.getDiem() >= 8 ){
            bill.setHocLuc("Gioi");
        } else if (bill.getDiem() > 6 && bill.getDiem() < 8){
            bill.setHocLuc("Kha");
        } else {
            bill.setHocLuc("Yeu");
        }

        return billRepository.saveAndFlush(bill);

    };
}
