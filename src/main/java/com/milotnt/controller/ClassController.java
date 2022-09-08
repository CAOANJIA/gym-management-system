package com.milotnt.controller;

import com.milotnt.pojo.ClassOrder;
import com.milotnt.pojo.ClassTable;
import com.milotnt.pojo.Member;
import com.milotnt.service.ClassOrderService;
import com.milotnt.service.ClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassTableService classTableService;

    @Autowired
    private ClassOrderService classOrderService;

    //查询课程
    @RequestMapping("/selClass")
    public String selectClass(Model model, HttpSession Session) {
        List<ClassTable> classList = classTableService.findAll();
        model.addAttribute("classList", classList);
        Session.setAttribute("classList", classList);
        System.out.println(classList);
        return "selectClass";
    }

    //跳转新增课程页面
    @RequestMapping("/toAddClass")
    public String toAddClass() {
        return "addClass";
    }

    //新增课程
    @RequestMapping("/addClass")
    public String addClass(ClassTable classTable) {
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDay = simpleDateFormat.format(date);

        classTable.setInsertTime(nowDay);
        classTable.setUpdateTime(nowDay);
        classTableService.insertClass(classTable);
        return "redirect:selClass";
    }

    //删除课程
    @RequestMapping("/delClass")
    public String deleteClass(Integer courseId) {
        classTableService.deleteClassBycourseId(courseId);
        classTableService.deleteOrderBycourseId(courseId);
        return "redirect:selClass";
    }

    //跳转课程修改页面
    @RequestMapping("/toUpdateClass")
    public String toUpdateClass(Integer courseId, Model model) {
        ClassTable classList = classTableService.selectBycourseId(courseId);
        model.addAttribute("classList", classList);
        return "updateClass";
    }

    //修改课程信息
    @RequestMapping("/updateClass")
    public String updateClass(ClassTable classTable,Model model) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowDay = simpleDateFormat.format(date);
        classTable.setUpdateTime(nowDay);
        classTableService.updateClassBycourseId(classTable);
        return "redirect:selClass";
    }

    //查询课程报名信息
    @RequestMapping("/selClassOrder")
    public String selectClassOrder(Integer courseId, Model model) {
        List<ClassOrder> classOrderList = classOrderService.selectMemberOrderList(courseId);
        model.addAttribute("classOrderList", classOrderList);
        return "selectClassOrder";
    }

}
