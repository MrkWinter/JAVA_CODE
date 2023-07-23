package com.mrkwinter.mhl.service;

import com.mrkwinter.mhl.dao.BillDao;
import com.mrkwinter.mhl.domain.Bill;
import com.mrkwinter.mhl.domain.Menu;

import java.util.List;
import java.util.UUID;

/**
 * @author MrkWinter
 * @version 1.0
 *     private Integer id;
 *     private String billId;
 *     private Integer menuId;
 *     private Integer nums;
 *     private double money;
 *     private Integer diningTableId;
 *     private Date billDate;
 *     private String state;
 */
public class BillService {
    private static BillDao billDao = new BillDao();
    public static boolean insertBill(Integer menuId, Integer nums, Integer diningTableId) {
        String billId = UUID.randomUUID().toString();
        Menu dishInfo = MenuService.getDishInfoById(menuId);
        double money = dishInfo.getPrice()* nums;
        billDao.updateSql("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billId,menuId,nums,money,diningTableId);
        DiningTableService.setDiningTableStateById(diningTableId);
        return true;
    }
    public static List<Bill> getBill() {
        return billDao.quarryMulti("select * from bill", Bill.class);
    }
    public static List<Bill> getDTableBill(Integer diningTableId) {
        return billDao.quarryMulti("select * from bill where diningTableId = ? and state = '未结账'", Bill.class, diningTableId);
    }
    public static boolean paySetBillFree(Integer diningTableId,String payWay) {
        billDao.updateSql("update bill set state = ? where diningTableID = ? and state = '未结账'",payWay,diningTableId);
        DiningTableService.freeDiningTableStateById(diningTableId);
        return true;
    }
}
