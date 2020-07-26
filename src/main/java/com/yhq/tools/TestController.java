package com.yhq.tools;

import com.yhq.tools.util.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools
 * @Description: TODO
 * @date Date : 2020年07月25日 15:08
 */
@RestController
public class TestController {

    @Value("${userName}")
    private String userName;

    @Value("${context}")
    private String context;


    @Autowired
    private UserConfig userConfig;


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayhello(){

        return "Hello :"+userName;
    }

    @RequestMapping(value = "/contexthello",method = RequestMethod.GET)
    public String contexthello(){


        return "Hello :"+ userConfig.getUserName()+","+userConfig.getSex();
    }
}
