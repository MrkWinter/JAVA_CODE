package com.mrkwinter.mhl.service;

import com.mrkwinter.mhl.dao.DiningTableDao;
import com.mrkwinter.mhl.domain.DiningTable;

import javax.swing.*;
import java.util.List;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class DiningTableService {
    private static DiningTableDao diningTableDao = new DiningTableDao();

    public static List<DiningTable> getDTablesInfo() {
        return diningTableDao.quarryMulti("select id,state from diningTable", DiningTable.class);
    }

    public static DiningTable getDTableById(Integer id) {
        return diningTableDao.quarrySingle("select * from diningTable where id = ?", DiningTable.class, id);
    }

    public static boolean setDiningTabInfo(Integer id, String orderName, String orderTel) {
        int affectedRow = diningTableDao.updateSql("update diningTable set state = '已预订', orderName = ?,orderTel = ? where id = ?", orderName, orderTel, id);
        return affectedRow > 0;
    }
    public static boolean setDiningTableStateById(Integer id) {
        int affectedRow = diningTableDao.updateSql("update diningTable set state = '在用餐' where id = ?", id);
        return affectedRow > 0;
    }
    public static boolean setDiningTableStateByIdComm(Integer id,String state) {
        int affectedRow = diningTableDao.updateSql("update diningTable set state = ? where id = ?",state,id);
        return affectedRow > 0;
    }
    public static  boolean freeDiningTableStateById(Integer id) {
        int affectedRow = diningTableDao.updateSql("update diningTable set state = '空',orderName = ' ',orderTel = ' ' where id = ?",id);
        return affectedRow > 0;
    }
}
