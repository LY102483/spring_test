package online.liuyang1024.controller;

import online.liuyang1024.domain.Role;
import online.liuyang1024.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @RequestMapping("/list")
    public ModelAndView list(ModelAndView modelAndView){
        List<Role> roleList=roleService.getRoleList();
        modelAndView.addObject("roleList",roleList);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }

    @RequestMapping("/addRole")
    public String addRole(Role role){
        int i=roleService.addRole(role);
        return "redirect:/role/list";
    }

}
