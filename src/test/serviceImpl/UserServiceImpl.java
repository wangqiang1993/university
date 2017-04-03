package test.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.IUserDao;
import test.pojo.User;
import test.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService{
    
    @Autowired
    private IUserDao userDao;
    
    @Override  
    public User getUserById(int userId) {
        User user=userDao.selectByPrimaryKey(userId);
        return user;  
    }  
  
}
