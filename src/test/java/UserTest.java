import java.util.List;

import com.website.dao.UserDao;
import com.website.daoimpl.UserDaoImpl;
import com.website.pojo.User;

public class UserTest {
    public static void main(String[] args) throws Exception {
        //新增
        UserDao userDao = new UserDaoImpl();
        User user = new User("10003228","张三","zhangsan","zhangsan","17295957454","17295957454@qq.com");
//        userDao.insertUser(user);
        //修改
//        userDao.updateUser(user);
//        User u = userDao.findUserByName("张三");
//        System.out.println(u.toString());
        List<User> list = userDao.findAllUser();
        for (User u : list) {
            System.out.println(u);
        }
    }
}
