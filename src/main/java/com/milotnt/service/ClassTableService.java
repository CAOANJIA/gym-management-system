package com.milotnt.service;

import com.milotnt.pojo.ClassTable;

import java.util.List;

public interface ClassTableService {

    //查询所有课程
    List<ClassTable> findAll();

    //根据id删除课程
    Boolean deleteClassBycourseId(Integer courseId);

    //添加课程
    Boolean insertClass(ClassTable classTable);

    //根据id查询课表
    ClassTable selectBycourseId(Integer courseId);

    //根据id删除已预约的课程
    Boolean deleteOrderBycourseId(Integer courseId);

}
