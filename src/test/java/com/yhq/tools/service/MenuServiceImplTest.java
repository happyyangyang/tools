package com.yhq.tools.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools.service
 * @Description: 添加单测
 * @date Date : 2020年07月27日 11:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class MenuServiceImplTest {

    @Autowired
    private  MenuService menuService;

    @Test
    void findAll() {
        System.out.println(menuService.findAll());
    }
}