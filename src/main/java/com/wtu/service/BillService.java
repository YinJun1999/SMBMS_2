package com.wtu.service;

import com.wtu.entity.Bill;
import com.wtu.entity.User;

import java.util.List;

public interface BillService {
    List<Bill> allBills();
}