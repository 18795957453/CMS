package com.website.dao;

import java.util.List;

import com.website.pojo.User;

public interface UserDao {

    /**
     * 注册用户
     * @param user
     * @throws Exception
     */
    public void insertUser(User user)throws Exception;
    
    /**
     * 删除用户
     * @param stuNUmber
     * @throws Exception
     */
    public void deleteUser(String stuNUmber)throws Exception;
    
    /**
     * 修改用户
     * @param user
     * @throws Exception
     */
    public void updateUser(User user)throws Exception;
    
    /**
     * 根据姓名模糊查询用户
     * @param name
     * @throws Exception
     */
    public User findUserByName(String name)throws Exception;
    
    /**
     * 查询所有用户
     * @return
     * @throws Exception
     */
    public List<User> findAllUser()throws Exception;
}
