package com.milotnt.service;

import com.milotnt.pojo.Coach;

import java.util.List;

public interface CoachService {

    //查询所有员工
    List<Coach> findAll();

    //根据员工账号删除员工
    Boolean deleteByCoachAccount(Integer trAc);

    //添加新员工
    Boolean insertCoach(Coach coach);

    //根据员工账号修改会员信息
    Boolean updateMemberByCoachAccount(Coach coach);

    //根据员工账号查询员工
    List<Coach> selectByCoachAccount(Integer trAc);

    //查询员工数
    Integer selectTotalCount();

}
