package com.milotnt.service.impl;

import com.milotnt.mapper.BillMapper;
import com.milotnt.mapper.MessageMapper;
import com.milotnt.pojo.Bill;
import com.milotnt.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceImpl implements BillService {
    @Autowired()
    private BillMapper billMapper;

    @Override
    public List<Bill> findAll(){return billMapper.findAll();}

    @Override
    public Boolean insertBill(Bill bill){return billMapper.insertBill(bill);}

    @Override
    public Integer querySumAmountByMonth(Integer month, String rcType){return billMapper.querySumAmountByMonth(month, rcType);}
}
