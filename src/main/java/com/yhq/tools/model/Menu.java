package com.yhq.tools.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools.model
 * @Description: TODO
 * @date Date : 2020年07月26日 10:48
 */
@Entity
@Getter
@Setter
public class Menu {

    @Id
    @GeneratedValue
    private  int id;

    //菜单名字
    private String name;
    //菜单路径
    private String path;

    //是否是一级菜单
    private String isFirst;
}
