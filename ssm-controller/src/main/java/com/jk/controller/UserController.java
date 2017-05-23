package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell on 2017/5/23.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("test")
    public ModelAndView test(){
        List<User> users = userService.test();
        ModelAndView mv = new ModelAndView();
        mv.addObject("users",users);
        mv.setViewName("success");
        return mv;
    }
}
