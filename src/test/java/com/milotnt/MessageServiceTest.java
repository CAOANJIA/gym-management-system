package com.milotnt;

import com.milotnt.pojo.Bill;
import com.milotnt.pojo.Member;
import com.milotnt.pojo.Message;
import com.milotnt.service.BillService;
import com.milotnt.service.MemberService;
import com.milotnt.service.MessageService;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class MessageServiceTest {
    @Autowired
    private MessageService messageService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private BillService billService;

    @Test
    public void testPrint(){
        System.out.println("message");
    }

    @Test
    public void testQuery(){
        //1.调用业务逻辑层中的查询方法
        List<Message> messages =
                messageService.findAll() ;
        //2.遍历查询结果
        for(Message message : messages){
            System.out.println(message);
        }
    }

    @Test
    public void testAddMessage(){
        Message message = new Message();
//        message.setCmId(3);
        message.setUserId(202214253);
        message.setCmContent("有点累");
        message.setInsertTime("2022-9-6");
        message.setUpdateTime("2022-9-7");
        message.setRemarks("no");
        messageService.insertMessage(message);
    }

    @Test
    public void testSelectByMessageId(){
        List<Message> messages =
                messageService.selectByMessageId(1) ;
        //2.遍历查询结果
        for(Message message : messages){
            System.out.println(message);
        }
    }

    @Test
    public void deleteByMessageId(){
        messageService.deleteByMessageId(2);
    }

    @Test
    public void testQueryMember(){
        List<Member> members =
                memberService.findAll();
        for(Member member : members){
            System.out.println(member);
        }
    }

    @Test
    public void testUpdateMember(){
        Member member = new Member();
        member.setUserId(1);
        member.setUserPt(123);
        memberService.updateMemberPtByMemberAccount(member);
    }

    @Test
    public void testQueryBill(){
        List<Bill> bills =
                billService.findAll();
        for(Bill bill : bills){
            System.out.println(bill);
        }
    }

    @Test
    public void testAddBill(){
        Bill bill = new Bill();
        bill.setUserId(202214253);
        bill.setRcType("充值");
        bill.setRcAmount(1000);
        bill.setInsertTime("2022-9-7");
        bill.setRemarks("no");
        billService.insertBill(bill);
    }

    @Test
    public void testselectMemberPt(){
        Integer Pt =
                memberService.selectMemberPtByMemberAccount(1111);
        System.out.println(Pt);
    }
}


