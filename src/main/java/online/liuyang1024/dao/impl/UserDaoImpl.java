package online.liuyang1024.dao.impl;

import online.liuyang1024.dao.UserDao;
import online.liuyang1024.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/4 10:03
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getUserList() {
        List<User> userList=jdbcTemplate.query("select * from sys_user", new BeanPropertyRowMapper<User>(User.class));
        for(User user:userList){
            System.out.println(user.toString());
        }
        return userList;
    }

    @Override
    public User login(String username, String password) throws EmptyResultDataAccessException {
        User user = jdbcTemplate.queryForObject("select * from sys_user where username=? and password=?", new BeanPropertyRowMapper<User>(User.class), username, password);
        return user;
    }
}
