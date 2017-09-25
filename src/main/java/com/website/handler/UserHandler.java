package com.website.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.website.dao.UserDao;
import com.website.daoimpl.UserDaoImpl;
import com.website.pojo.User;

@Controller
public class UserHandler {
    
    @ResponseBody
    @RequestMapping(value="register",method=RequestMethod.POST)
    public String insertUser(User user) throws Exception {
        UserDao userDao = new UserDaoImpl();
        userDao.insertUser(user);
        return "redirect:index.html";        
    }

}
