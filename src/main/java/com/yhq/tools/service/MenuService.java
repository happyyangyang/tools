package com.yhq.tools.service;

import com.yhq.tools.dao.MenuRepository;
import com.yhq.tools.model.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools.service
 * @Description: TODO
 * @date Date : 2020年07月27日 10:12
 */

public interface MenuService {


    public List<Menu> findAll();
}
