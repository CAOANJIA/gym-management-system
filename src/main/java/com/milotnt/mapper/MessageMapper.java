package com.milotnt.mapper;

import com.milotnt.pojo.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MessageMapper {
    //查询留言信息
    List<Message> findAll();

    //新增信息
    Boolean insertMessage(Message message);

    //查询会员ID查询留言信息
    List<Message> selectByMessageId(Integer cmUserId);

    //根据留言ID删除留言信息
    Boolean deleteByMessageId(Integer cmId);

    //查询会员数
//    Integer selectTotalCount();

    //根据会员账号查询会员
//    List<Member> selectByMemberAccount(Integer memberAccount);
}
