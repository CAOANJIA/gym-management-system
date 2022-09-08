package com.milotnt.mapper;

import com.milotnt.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillMapper {

    List<Bill> findAll();

    Boolean insertBill(Bill bill);


    Integer querySumAmountByMonth(Integer month, String rcType);

    List<Bill> selectBillByUserId(Integer userId);

}
