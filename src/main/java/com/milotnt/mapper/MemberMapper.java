package com.milotnt.mapper;

import com.milotnt.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MemberMapper {

    //查询会员信息
    List<Member> findAll();

    //新增会员信息
    Boolean insertUser(Member member);

    //根据会员账号修改会员信息
    Boolean updateMemberByMemberAccount(Member member);

    //根据会员账号修改会员余额
    Boolean updateMemberPtByMemberAccount(Member member);

    //查询会员账号密码
    Member selectByAccountAndPassword(Member member);

    //根据会员账号删除会员信息
    Boolean deleteByMemberAccount(Integer memberAccount);

    //查询会员数
    Integer selectTotalCount();

    //根据会员账号查询会员
    List<Member> selectByMemberAccount(Integer memberAccount);

}
