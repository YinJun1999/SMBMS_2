package com.wtu.controller;

import com.wtu.entity.User;
import com.wtu.service.BillService;
import com.wtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    private BillService billService;

    @RequestMapping("/login")
    public String login(String userCode, String userPassword, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        map.put("userCode",userCode);
        map.put("userPassword",userPassword);
        User user = userService.login(map);
        if (user==null){  //登陆失败
            session.setAttribute("error","用户名或密码错误");
            return "redirect:index.jsp";
        }
        session.setAttribute("userSession",user);
        return "frame";
    }
    //查询所有用户列表
    @RequestMapping("/allUsers")
    public String allUsers(HttpSession session, Model model){
        if (session.getAttribute("userSession")==null){//必须登录后才能访问列表页面
            return "redirect:index.jsp";
        }
        List<User> userList = userService.allUsers();
        model.addAttribute("userList",userList);
        return "userlist";
    }
    //添加用户信息


}
