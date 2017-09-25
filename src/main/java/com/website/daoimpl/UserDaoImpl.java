package com.website.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.website.dao.UserDao;
import com.website.pojo.User;
import com.website.utils.JdbcUtil;

public class UserDaoImpl implements UserDao{

    public void insertUser(User user) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql = "insert into User(stuNumber,name,userName.passWord,phoneNumber,email) values(?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getStuNumber());
            ps.setString(2, user.getName());
            ps.setString(3, user.getUserName());
            ps.setString(3, user.getPassWord());
            ps.setString(3, user.getPhoneNumber());
            ps.setString(3, user.getEmail());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }finally{
            JdbcUtil.CloseResource(conn, ps, null);
        }
    }

    public void deleteUser(String stuNUmber) throws Exception {
        // TODO Auto-generated method stub
        
    }

    public void updateUser(User user) throws Exception {
        // TODO Auto-generated method stub
        
    }

    public User findUserByName(String name) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    public List<User> findAllUser() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
