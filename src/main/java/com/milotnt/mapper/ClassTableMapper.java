package com.milotnt.mapper;

import com.milotnt.pojo.ClassTable;
import com.milotnt.pojo.Equipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassTableMapper {

    //查询所有课程
    List<ClassTable> findAll();

    //根据id删除课程
    Boolean deleteClassBycourseId(Integer courseId);

    //添加课程
    Boolean insertClass(ClassTable classTable);

    //根据id修改课程信息
    Boolean updateClassBycourseId(ClassTable classTable);

    //根据id查询课表
    ClassTable selectBycourseId(Integer courseId);

    //根据id删除已预约的课程
    Boolean deleteOrderBycourseId(Integer courseId);

}
