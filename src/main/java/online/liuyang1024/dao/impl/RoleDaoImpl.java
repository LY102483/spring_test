package online.liuyang1024.dao.impl;

import online.liuyang1024.dao.RoleDao;
import online.liuyang1024.domain.Role;
import online.liuyang1024.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ContextConfiguration("classpath:applicationContext.xml")
public class RoleDaoImpl implements RoleDao {
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Role> getRoleList() {
       return jdbcTemplate.query("select * from sys_role", new BeanPropertyRowMapper<Role>(Role.class));
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
