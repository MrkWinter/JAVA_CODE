package com.mrkwinter.mhl.service;

import com.mrkwinter.mhl.dao.MenuDao;
import com.mrkwinter.mhl.domain.Menu;

import java.util.List;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class MenuService {
    private static MenuDao menuDao = new MenuDao();

    public static List<Menu> getMenu() {
        return menuDao.quarryMulti("select * from menu", Menu.class);
    }

    public static Menu getDishInfoById(Integer id) {
        return menuDao.quarrySingle("select * from menu where id = ?", Menu.class, id);
    }
}
