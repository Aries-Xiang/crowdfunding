package com.aries.crowdfunding.mvc.controller;

import com.aries.crowdfunding.entity.Admin;
import com.aries.crowdfunding.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @program: crowdfunding
 * @description:
 * @author: Aries
 * @create: 2020-04-27 15:23
 **/
@Controller
public class TestController {

    @Autowired
    private AdminService adminService;


    @RequestMapping("send/array.html")
    public String testReceivedArrayOne(@RequestParam("array[]") List<Integer> array){
        array.stream().forEach(System.out::println);
        return "success";
    }
    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap){
        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList", adminList);
        return "target";
    }
}
