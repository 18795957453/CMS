package com.website.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            String sql = "insert into user(stuNumber,name,userName,passWord,phoneNumber,email) values(?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getStuNumber());
            ps.setString(2, user.getName());
            ps.setString(3, user.getUserName());
            ps.setString(4, user.getPassWord());
            ps.setString(5, user.getPhoneNumber());
            ps.setString(6, user.getEmail());           
            ps.executeUpdate();           
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }finally{
            JdbcUtil.CloseResource(conn, ps, null);
        }
    }

    public void deleteUser(String stuNUmber) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql = "delete from user where stuNumber = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, stuNUmber);          
            ps.executeUpdate();           
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }finally{
            JdbcUtil.CloseResource(conn, ps, null);
        }       
    }

    public void updateUser(User user) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql = "update user u set u.stuNumber = ?, u.name = ?, u.userName = ?, u.passWord = ?, u.phoneNumber = ?, u.email = ? where u.stuNumber = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getStuNumber());
            ps.setString(2, user.getName());
            ps.setString(3, user.getUserName());
            ps.setString(4, user.getPassWord());
            ps.setString(5, user.getPhoneNumber());
            ps.setString(6, user.getEmail()); 
            ps.setString(7, user.getStuNumber());
            ps.executeUpdate();           
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }finally{
            JdbcUtil.CloseResource(conn, ps, null);
        }
    }

    public User findUserByName(String name) throws Exception {
        User user = new User();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql = "select * from user where name = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while(rs.next()) {
                user.setStuNumber(rs.getString("stuNumber"));
                user.setName(rs.getString("name"));
                user.setUserName(rs.getString("userName"));
                user.setPassWord(rs.getString("passWord"));
                user.setPhoneNumber(rs.getString("phoneNumber"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }finally {
            JdbcUtil.CloseResource(conn, ps, null); 
        }
        return user;
    }

    public List<User> findAllUser() throws Exception {
        List<User> list = new ArrayList<User>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql = "select * from user";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setStuNumber(rs.getString("stuNumber"));
                user.setName(rs.getString("name"));
                user.setUserName(rs.getString("userName"));
                user.setPassWord(rs.getString("passWord"));
                user.setPhoneNumber(rs.getString("phoneNumber"));
                user.setEmail(rs.getString("email"));
                list.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }finally {
            JdbcUtil.CloseResource(conn, ps, null); 
        }
        return list;
    }
}
