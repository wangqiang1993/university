package test.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.pojo.User;
import test.service.IUserService;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:resources/spring-mybatis.xml"})  
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private IUserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
//  
    @Test  
    public void test1() {  
        System.out.println("--------1111-----");
        User user = userService.getUserById(2);  
        System.out.println("-------------");
        System.out.println(user.getId()+":"+user.getName());
        // System.out.println(user.getUserName());  
         logger.info("-------------------");  
        logger.info(JSON.toJSONString(user));  
    }  
}  