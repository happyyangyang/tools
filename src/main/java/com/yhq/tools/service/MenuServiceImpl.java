package com.yhq.tools.service;

import com.yhq.tools.dao.MenuRepository;
import com.yhq.tools.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools.service
 * @Description: TODO
 * @date Date : 2020年07月27日 10:38
 */
@Service
public class MenuServiceImpl implements MenuService {



    @Autowired
    private MenuRepository menuRepository;



    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }
}
