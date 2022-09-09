package com.milotnt.service.impl;

import com.milotnt.mapper.ClassTableMapper;
import com.milotnt.pojo.ClassTable;
import com.milotnt.service.ClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassTableServiceImpl implements ClassTableService {

    @Autowired
    private ClassTableMapper classTableMapper;

    @Override
    public List<ClassTable> findAll() {
        return classTableMapper.findAll();
    }

    @Override
    public Boolean deleteClassBycourseId(Integer courseId) {
        return classTableMapper.deleteClassBycourseId(courseId);
    }

    @Override
    public Boolean insertClass(ClassTable classTable) {
        return classTableMapper.insertClass(classTable);
    }

    @Override
    public Boolean updateClassBycourseId(ClassTable classTable) {
        return classTableMapper.updateClassBycourseId(classTable);
    }

    @Override
    public ClassTable selectBycourseId(Integer courseId) {
        return classTableMapper.selectBycourseId(courseId);
    }

    @Override
    public Boolean deleteOrderBycourseId(Integer courseId) {
        return classTableMapper.deleteOrderBycourseId(courseId);
    }
}
