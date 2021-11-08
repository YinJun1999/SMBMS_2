package com.wtu.service;

import com.wtu.entity.Bill;
import com.wtu.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillMapper billMapper;
    @Override
    public List<Bill> allBills() {
        return billMapper.allBills();
    }
}
