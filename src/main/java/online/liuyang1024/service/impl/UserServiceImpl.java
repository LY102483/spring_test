package online.liuyang1024.service.impl;

import online.liuyang1024.dao.UserDao;
import online.liuyang1024.domain.User;
import online.liuyang1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
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
    }

    @Override
    public User login(String username, String password) {
        //获取Dao返回的对象，因为数据可能为空，所以进行捕获
        try {
            User user = userDao.login(username, password);
            return user;
        }catch (EmptyResultDataAccessException e){
            return null;
        }

    }

    ;
}
