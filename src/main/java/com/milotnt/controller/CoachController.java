package com.milotnt.controller;

import com.milotnt.pojo.Coach;
import com.milotnt.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Controller
@RequestMapping("/employee")
public class CoachController {

    @Autowired
    private CoachService coachService;

    //查询员工
    @RequestMapping("/selEmployee")
    public String selectCoach(Model model) {
        List<Coach> coachList = coachService.findAll();
        model.addAttribute("coachList", coachList);
        return "selectEmployee";
    }

    //跳转新增员工页面
    @RequestMapping("/toAddEmployee")
    public String toAddCoach() {
        return "addEmployee";
    }

    //新增员工
    @RequestMapping("/addEmployee")
    public String addEmployee(Coach coach) {
        //工号随机生成
        Random random = new Random();
        String account1 = "1010";
        for (int i = 0; i < 5; i++) {
            account1 += random.nextInt(10);
        }
        Integer account = Integer.parseInt(account1);

        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDay = simpleDateFormat.format(date);

        coach.setTrAc(account);
        coach.setInsertTime(nowDay);
        coach.setUpdateTime(nowDay);
        coach.setTrId(account);

        coachService.insertCoach(coach);

        return "redirect:selEmployee";

    }

    //删除员工
    @RequestMapping("/delEmployee")
    public String deleteCoach(Integer trAc) {
        coachService.deleteByCoachAccount(trAc);
        return "redirect:selEmployee";
    }

    //跳转员工修改页面
    @RequestMapping("/toUpdateEmployee")
    public String toUpdateCoach(Integer trAc, Model model) {
        List<Coach> coachList = coachService.selectByCoachAccount(trAc);
        model.addAttribute("coachList", coachList);
//        model.addAttribute("employeeList", coachList);
        return "updateEmployee";
    }

    //修改员工信息
    @RequestMapping("/updateEmployee")
    public String updateCoach(Coach coach) {

        //获取当前时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowDay = simpleDateFormat.format(date);
        coach.setUpdateTime(nowDay);

        coachService.updateMemberByCoachAccount(coach);

//        employeeService.updateMemberByEmployeeAccount(employee);
        return "redirect:selEmployee";
    }

}
