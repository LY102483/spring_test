package online.liuyang1024.dao.impl;

import online.liuyang1024.dao.RoleDao;
import online.liuyang1024.domain.Role;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ContextConfiguration("classpath:applicationContext.xml")
public class RoleDaoImpl implements RoleDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Role> getRoleList() {
       return jdbcTemplate.query("select * from sys_role", new BeanPropertyRowMapper<Role>(Role.class));
    }

    @Override
    public int addRole(Role role) {
        return jdbcTemplate.update("insert into sys_role  values (?,?,?)",null,role.getRoleName(),role.getRoleDesc());
    }


}
