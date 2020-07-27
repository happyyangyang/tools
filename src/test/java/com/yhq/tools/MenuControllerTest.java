package com.yhq.tools;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools
 * @Description: controller 单元测试 通过请求直接测试
 * @date Date : 2020年07月27日 11:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class MenuControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getMenu() throws  Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/menu99")).andExpect(MockMvcResultMatchers.status().isOk());

    }
}