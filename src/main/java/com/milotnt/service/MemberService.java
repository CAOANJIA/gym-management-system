package com.milotnt.service;

import com.milotnt.pojo.Member;

import java.util.List;

public interface MemberService {

    //查询会员信息
    List<Member> findAll();

    //新增会员信息
    Boolean insertUser(Member user);

    //根据会员账号修改会员信息
    Boolean updateMemberByMemberAccount(Member member);

    //根据会员账号修改会员余额
    Boolean updateMemberPtByMemberAccount(Member member);

    //根据会员Id查询会员余额
    Integer selectMemberPtByMemberAccount(Integer userId);

    //查询会员账号密码（登录）
    Member userLogin(Member member);
    //Member selectByAccountAndPassword(Member member);

    //根据会员账号删除会员信息
    Boolean deleteByMemberAccount(Integer memberAccount);

    //查询会员数
    Integer selectTotalCount();

    //根据会员账号查询会员
    List<Member> selectByMemberAccount(Integer memberAccount);

}