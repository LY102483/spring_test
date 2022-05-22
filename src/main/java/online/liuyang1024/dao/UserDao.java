package online.liuyang1024.dao;

import online.liuyang1024.domain.User;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/4 10:02
 */
public interface UserDao {
    public List<User> getUserList();

    public User login(String username, String password);
}
