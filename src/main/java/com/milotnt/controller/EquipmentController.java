package com.milotnt.controller;

import com.milotnt.pojo.Equipment;
import com.milotnt.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    //查询器材
    @RequestMapping("/selEquipment")
    public String selectEquipment(Model model, HttpSession session) {
        List<Equipment> equipmentList = equipmentService.findAll();
        session.setAttribute("equipmentList", equipmentList);
        model.addAttribute("equipmentList", equipmentList);
        return "selectEquipment";
    }

    //删除器材
    @RequestMapping("/delEquipment")
    public String deleteEquipment(Integer eqId) {
        equipmentService.deleteByeqId(eqId);
        return "redirect:selEquipment";
    }

    //跳转修改器材页面
    @RequestMapping("/toUpdateEquipment")
    public String toUpdateEquipment(Integer eqId, Model model) {
        List<Equipment> equipmentList = equipmentService.selectByeqId(eqId);
        model.addAttribute("equipmentList", equipmentList);
        return "updateEquipment";
    }

    //修改器材
    @RequestMapping("/updateEquipment")
    public String updateEquipment(Equipment equipment) {
        equipmentService.updateEquipmentByeqId(equipment);
        return "redirect:selEquipment";
    }

    //跳转新增器材页面
    @RequestMapping("/toAddEquipment")
    public String toAddEquipment() {
        return "addEquipment";
    }

    //新增器材
    @RequestMapping("/addEquipment")
    public String addEquipment(Equipment equipment) {
        //器材编号随机生成
        Random random = new Random();
        String id1 = "2022";
        for (int i = 0; i < 5; i++) {
            id1 += random.nextInt(10);
        }
        Integer id = Integer.parseInt(id1);
        equipment.setEqId(id);

        equipmentService.insertEquipment(equipment);
        return "redirect:selEquipment";
    }

}
