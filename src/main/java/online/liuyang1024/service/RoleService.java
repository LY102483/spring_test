package online.liuyang1024.service;

import online.liuyang1024.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getRoleList();
    public int addRole(Role role);
}
