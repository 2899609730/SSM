package com.fox.dao;

import com.fox.domain.Menu;

import java.util.List;

public interface MenuMapper {

    /*
        查询所有父子菜单信息
     */

    public List<Menu> findSubMenuListByPid(int pid);
    // 主干代码用于回退

    /*
        查询所有菜单列表
     */
    public List<Menu> findAllMenu();


    Menu findMenuById(Integer id);
}
