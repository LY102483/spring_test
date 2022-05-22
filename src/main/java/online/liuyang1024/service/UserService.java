package online.liuyang1024.service;

import online.liuyang1024.domain.User;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/4 10:04
 */

public interface UserService {

    public List<User> getUserList();
    public User login(String username, String password);
}
