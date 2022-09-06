package com.milotnt.service.impl;

import com.milotnt.mapper.CoachMapper;
import com.milotnt.pojo.Coach;
import com.milotnt.pojo.Coach;
import com.milotnt.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

@Service
public class CoachServiceImpl implements CoachService {

    @Autowired
    private CoachMapper coachMapper;

    @Override
    public List<Coach> findAll() {
        return coachMapper.findAll();
    }

    @Override
    public Boolean deleteByCoachAccount(Integer trAc) {
        return coachMapper.deleteByCoachAccount(trAc);
    }

    @Override
    public Boolean insertCoach(Coach coach) {
        return coachMapper.insertCoach(coach);
    }

    @Override
    public Boolean updateMemberByCoachAccount(Coach coach) {
        return coachMapper.updateMemberByCoachAccount(coach);
    }

    @Override
    public List<Coach> selectByCoachAccount(Integer trAc) {
        return coachMapper.selectByCoachAccount(trAc);
    }

    @Override
    public Integer selectTotalCount() {
        return coachMapper.selectTotalCount();
    }
}
