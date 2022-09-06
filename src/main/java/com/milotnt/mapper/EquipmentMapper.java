package com.milotnt.mapper;

import com.milotnt.pojo.Equipment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EquipmentMapper {

    //查询所有器械
    List<Equipment> findAll();

    //根据id删除器械
    Boolean deleteByeqId(Integer eqId);

    //添加器材
    Boolean insertEquipment(Equipment equipment);

    //根据id修改器械信息
    Boolean updateEquipmentByeqId(Equipment equipment);

    //根据id查询器械
    List<Equipment> selectByeqId(Integer eqId);

    //查询器械总数
    Integer selectTotalCount();

}
