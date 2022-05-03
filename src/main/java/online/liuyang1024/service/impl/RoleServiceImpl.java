package online.liuyang1024.service.impl;

import online.liuyang1024.dao.RoleDao;
import online.liuyang1024.domain.Role;
import online.liuyang1024.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }


    @Override
    public List<Role> getRoleList() {

        return roleDao.getRoleList();
    }
}
