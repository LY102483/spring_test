package online.liuyang1024.controller;

import online.liuyang1024.domain.Role;
import online.liuyang1024.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    private RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }



    @RequestMapping("/list")
    public ModelAndView list(ModelAndView modelAndView){
        List<Role> roleList=roleService.getRoleList();
        modelAndView.addObject("roleList",roleList);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }
}
