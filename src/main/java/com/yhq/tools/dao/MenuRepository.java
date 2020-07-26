package com.yhq.tools.dao;

import com.yhq.tools.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools.dao
 * @Description: TODO
 * @date Date : 2020年07月26日 16:25
 */
public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
