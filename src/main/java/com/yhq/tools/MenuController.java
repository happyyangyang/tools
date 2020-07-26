package com.yhq.tools;

import com.yhq.tools.dao.MenuRepository;
import com.yhq.tools.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PreUpdate;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools
 * @Description: 菜单到添加
 * @date Date : 2020年07月25日 21:31
 */

@RestController
//@RequestMapping(path = "menu")
public class MenuController {


    @Autowired
    private MenuRepository menuRepository;


    @PostMapping(path = "/menu")
    public Menu addMenu(@RequestBody Menu menu){

        return menuRepository.save(menu);

    }


    @GetMapping(path = "/menu")
    public List<Menu> getMenu(){

        return menuRepository.findAll();

    }
    /*
    更新
     */
    @PutMapping(path = "/menu/{id}")
    public Menu putMenu(@PathParam("id") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("path") String path
                        ){

        Menu m = new Menu();
        m.setId(id);
        m.setName(name);
        m.setPath(path);

         return menuRepository.save(m);

    }






}
