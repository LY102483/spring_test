package online.liuyang1024.controller;

import online.liuyang1024.domain.User;
import online.liuyang1024.service.RoleService;
import online.liuyang1024.service.UserService;
import online.liuyang1024.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/4 09:57
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String username,String password){
        User user=userService.login(username,password);
        if(user==null){
            return "redirect:  ";
        }
        return "main";
    }

    @RequestMapping("getUserList")
    public ModelAndView getUserList(ModelAndView modelAndView){
        List<User> list = userService.getUserList();
        for(int i = 0;i < list.size(); i ++){
            System.out.println(list.get(i));
        }
        modelAndView.addObject("userList",list);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }
}
