package com.ssm.service;

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
  
import com.ssm.baseTest.SpringTestCase;  
import com.ssm.entity.User;  

public class UserServiceTest extends SpringTestCase {
    @Autowired
    private UserService userService;
    Logger logger = Logger.getLogger(UserServiceTest.class);
    
    @Test
    public void selectUserByIdTest(){
        User user = userService.getUserById("2");
        logger.debug("用户" + user);
    }
    
}