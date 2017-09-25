package com.website.dao;

import java.util.List;

import com.website.pojo.User;

public interface UserDao {

    /**
     * ע���û�
     * @param user
     * @throws Exception
     */
    public void insertUser(User user)throws Exception;
    
    /**
     * ɾ���û�
     * @param stuNUmber
     * @throws Exception
     */
    public void deleteUser(String stuNUmber)throws Exception;
    
    /**
     * �޸��û�
     * @param user
     * @throws Exception
     */
    public void updateUser(User user)throws Exception;
    
    /**
     * ��������ģ����ѯ�û�
     * @param name
     * @throws Exception
     */
    public User findUserByName(String name)throws Exception;
    
    /**
     * ��ѯ�����û�
     * @return
     * @throws Exception
     */
    public List<User> findAllUser()throws Exception;
}
