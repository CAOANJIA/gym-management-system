package com.milotnt.controller;

import com.milotnt.pojo.ClassOrder;
import com.milotnt.pojo.ClassTable;
import com.milotnt.pojo.Member;
import com.milotnt.service.ClassOrderService;
import com.milotnt.service.ClassTableService;
import com.milotnt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ClassTableService classTableService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private ClassOrderService classOrderService;


    //跳转个人信息页面
    @RequestMapping("/toUserInfo")
    public String toUserInformation(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("user");
        model.addAttribute("member", member);
        return "userInformation";
    }

    //跳转个人留言页面
    @RequestMapping("/toUserMessage")
    public String toUserMessage(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("user");
        model.addAttribute("member", member);
        return "userMessage";
    }

    //跳转新增留言页面
    @RequestMapping("/toAddMessage")
    public String toMessage() {
        return "addMessage";
    }

    //添加留言界面
    @RequestMapping("/addMessage")
    public String toAddMessage(Model model, HttpSession session) {
        //工号随机生成
//        Random random = new Random();
//        String account1 = "1010";
//        for (int i = 0; i < 5; i++) {
//            account1 += random.nextInt(10);
//        }
//        Integer account = Integer.parseInt(account1);
//
//        //获取当前日期
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String nowDay = simpleDateFormat.format(date);
//
//        employee.setEmployeeAccount(account);
//        employee.setEntryTime(nowDay);
//
//        employeeService.insertEmployee(employee);

        return "redirect:toUserMessage";
    }

    //跳转修改个人信息页面
    @RequestMapping("/toUpdateInfo")
    public String toUpdateUserInformation(HttpSession session, Model model) {
        Member member = (Member) session.getAttribute("user");
        model.addAttribute("member", member);
        return "updateUserInformation";
    }

    //修改个人信息
    @RequestMapping("/updateInfo")
    public String updateUserInformation(HttpSession session, Member member) {
        Member member1 = (Member) session.getAttribute("user");

        member.setUserAc(member1.getUserAc());

        memberService.updateMemberByMemberAccount(member);
        return "userInformation";
    }

    //跳转我的课程页面
    @RequestMapping("/toUserClass")
    public String toUserClass(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("user");
        model.addAttribute("member", member);
        Integer memberAccount = member.getUserAc();
        List<ClassOrder> classOrderList = classOrderService.selectClassOrderByMemberAccount(memberAccount);
        model.addAttribute("classOrderList", classOrderList);
        return "userClass";
    }

    //退课
    @RequestMapping("delUserClass")
    public String deleteUserClass(Integer classOrderId) {
        classOrderService.deleteByClassOrderId(classOrderId);
        return "redirect:toUserClass";
    }

    //跳转报名选课页面
    @RequestMapping("/toApplyClass")
    public String toUserApplyClass(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("user");
        List<ClassTable> classList = classTableService.findAll();
        model.addAttribute("member", member);
        model.addAttribute("classList", classList);
        return "userApplyClass";
    }

    //报名选课
    @RequestMapping("/applyClass")
    public String userApplyClass(Integer courseId, Model model, HttpSession session) {
        ClassTable classTable = classTableService.selectBycourseId(courseId);
        Member member = (Member) session.getAttribute("user");

        Integer courseId1 = classTable.getcourseId();
        String courseName = classTable.getcourseName();
        String coach = classTable.getcourseBegin();
        String classBegin = classTable.getcourseBegin();
        String memberName = member.getUserName();
        Integer memberAccount = member.getUserAc();

        ClassOrder classOrder = new ClassOrder(courseId1, courseName, coach, memberName, memberAccount, classBegin);
        Integer memberAccount1 = member.getUserAc();
        ClassOrder classOrder1 = classOrderService.selectMemberByClassIdAndMemberAccount(courseId1, memberAccount1);

        if (classOrder1 == null) {
            classOrderService.insertClassOrder(classOrder);
        }

        return "redirect:toUserClass";
    }

    //跳转会员业务页面
    @RequestMapping("/toUserBusiness")
    public String toUserBusiness(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("user");
        model.addAttribute("member", member);
        return "userBusiness";
    }

    //会员充值
    @RequestMapping("/updateBusiness")
    public String updateUserBusiness(HttpSession session, Member member) {
        Member member1 = (Member) session.getAttribute("user");

        member.setUserAc(member1.getUserAc());


//        memberService.updateMemberByMemberAccount(member);
        return "userBusiness";
    }
}
