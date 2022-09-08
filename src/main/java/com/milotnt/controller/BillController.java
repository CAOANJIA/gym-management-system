package com.milotnt.controller;

import com.milotnt.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping("/queryXiaoFeiSumAmountByMonth")
    public List<Map<String,Object>> querySumAmountByMonth(){
        List<Map<String,Object>> values = new ArrayList<Map<String,Object>>();
        for(Integer month = 1; month <= 12; month++){
            Map<String,Object> data = new HashMap<>();
            Integer sumAmount = billService.querySumAmountByMonth(month, "消费");
            data.put("mon", month);
            if(sumAmount == null)
                data.put("sumAmount", 0);
            else
                data.put("sumAmount", sumAmount);
            values.add(data);
        }
        return values;
    }

    @RequestMapping("/queryChongZhiSumAmountByMonth")
    public List<Map<String,Object>> queryChongZhiSumAmountByMonth(){
        List<Map<String,Object>> values = new ArrayList<Map<String,Object>>();
        for(Integer month = 1; month <= 12; month++){
            Map<String,Object> data = new HashMap<>();
            Integer sumAmount = billService.querySumAmountByMonth(month, "充值");
            data.put("mon", month);
            if(sumAmount == null)
                data.put("sumAmount", 0);
            else
                data.put("sumAmount", sumAmount);
            values.add(data);
        }
        return values;
    }

}
