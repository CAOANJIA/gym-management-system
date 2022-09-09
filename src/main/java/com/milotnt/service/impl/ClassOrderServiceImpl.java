package com.milotnt.service.impl;

import com.milotnt.mapper.ClassOrderMapper;
import com.milotnt.pojo.ClassOrder;
import com.milotnt.service.ClassOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassOrderServiceImpl implements ClassOrderService {

    @Autowired
    private ClassOrderMapper classOrderMapper;

    @Override
    public List<ClassOrder> findAll() {
        return classOrderMapper.findAll();
    }

    @Override
    public Boolean insertClassOrder(ClassOrder classOrder) {
        return classOrderMapper.insertClassOrder(classOrder);
    }

    @Override
    public List<ClassOrder> selectClassOrderByMemberAccount(Integer userId) {
        return classOrderMapper.selectClassOrderByMemberAccount(userId);
    }

    @Override
    public Boolean deleteByClassOrderId(Integer appid) {
        return classOrderMapper.deleteByClassOrderId(appid);
    }

    @Override
    public ClassOrder selectMemberByClassIdAndMemberAccount(Integer courseId, Integer userId) {
        return classOrderMapper.selectMemberByClassIdAndMemberAccount(courseId, userId);
    }

    @Override
    public List<ClassOrder> selectMemberOrderList(Integer courseId) {
        return classOrderMapper.selectMemberOrderList(courseId);
    }
}
