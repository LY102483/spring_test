package online.liuyang1024.service.impl;

import online.liuyang1024.dao.UserDao;
import online.liuyang1024.domain.User;
import online.liuyang1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/4 10:05
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUserList(){
        return userDao.getUserList();
    };
}
