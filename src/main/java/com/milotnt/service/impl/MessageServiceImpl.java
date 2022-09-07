package com.milotnt.service.impl;

import com.milotnt.mapper.MessageMapper;
import com.milotnt.pojo.Message;
import com.milotnt.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> findAll() {
        return messageMapper.findAll();
    }

    @Override
    public Boolean insertMessage(Message message) {
        return messageMapper.insertMessage(message);
    }

//    @Override
//    public Boolean updateMemberByMemberAccount(Member member) {
//        return memberMapper.updateMemberByMemberAccount(member);
//    }

    @Override
    public List<Message> selectByMessageId(Integer cmUserId) {
        return messageMapper.selectByMessageId(cmUserId);
    }

    @Override
    public Boolean deleteByMessageId(Integer cmId) {
        return messageMapper.deleteByMessageId(cmId);
    }

//    @Override
//    public Integer selectTotalCount() {
//        return memberMapper.selectTotalCount();
//    }
//
//    @Override
//    public List<Member> selectByMemberAccount(Integer memberAccount) {
//        return memberMapper.selectByMemberAccount(memberAccount);
//    }
}
