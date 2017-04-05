package test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test.pojo.User;
import test.service.IUserService;

@Controller  
@RequestMapping("/user")  
public class UserController {
    
    private static Logger logger = Logger.getLogger(UserController.class); 
    @Resource  
    private IUserService userService=null;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        logger.info("-----------------------------");
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
}
