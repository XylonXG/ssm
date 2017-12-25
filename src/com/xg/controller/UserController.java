package com.xg.controller;

import com.xg.entity.User;
import com.xg.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/userLogin")
    public ModelAndView userLogin(User user){
        ModelAndView mav=new ModelAndView();
        user=userService.checkUserLogin(user.getName(),user.getPassword());
        if(user!=null){
        mav.getModel().put("user",user);
        mav.setViewName("/right.jsp");
        }else {
            mav.setViewName("/error.jsp");
        }
        return mav;
    }
}
