package com.mrkwinter.mhl.view;

import com.mrkwinter.mhl.dao.BillDao;
import com.mrkwinter.mhl.dao.DiningTableDao;
import com.mrkwinter.mhl.domain.Bill;
import com.mrkwinter.mhl.domain.DiningTable;
import com.mrkwinter.mhl.domain.Employee;
import com.mrkwinter.mhl.domain.Menu;
import com.mrkwinter.mhl.service.BillService;
import com.mrkwinter.mhl.service.DiningTableService;
import com.mrkwinter.mhl.service.EmployeeService;
import com.mrkwinter.mhl.service.MenuService;
import com.mrkwinter.mhl.utils.Utility;

import java.util.List;
import java.util.UUID;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class MHLViews {
    private boolean loop = true;

    public void mhlView() {
        while (loop) {
            System.out.println("================满汉楼================");
            System.out.println("\t\t 1. 登录满汉楼");
            System.out.println("\t\t 2. 退出满汉楼");
            System.out.println("请输入你的选择：");
            int choice = Utility.readInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入员工账号：");
                    String empId = Utility.readString(50);
                    System.out.println("请输入员工密码：");
                    String password = Utility.readString(30);
                    Employee employee = EmployeeService.employeeIsExist(empId, password);
                    if (employee != null) {
                        while (loop) {
                            loop = mhlViewTwo();
                        }
                    } else {
                        System.out.println("账号或密码错误");
                    }
                    break;
                case 2:
                    loop = false;
                    System.out.println("退出满汉楼");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    public boolean mhlViewTwo() {
        System.out.println("登录成功");
        while (true) {
            System.out.println("==============满汉楼二级菜单==============");
            System.out.println("\t\t 1.显示餐桌状态");
            System.out.println("\t\t 2.预订餐桌");
            System.out.println("\t\t 3.显示所有菜品");
            System.out.println("\t\t 4.点餐服务");
            System.out.println("\t\t 5.查看账单");
            System.out.println("\t\t 6.结账");
            System.out.println("\t\t 9.退出满汉楼");
            System.out.println("请输入你的选择：");
            int choice = Utility.readInt();
            switch (choice) {
                case 1:
                    showDTablesInfo();
                    break;
                case 2:
                    orderDTable();
                    break;
                case 3:
                    showMenu();
                    break;
                case 4:
                    orderDish();
                    break;
                case 5:
                    showBill();
                    break;
                case 6:
                    payBill();
                    break;
                case 9:
                    return false;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    public void showDTablesInfo() {
        List<DiningTable> dTablesInfo = DiningTableService.getDTablesInfo();
        System.out.println("id \t state");
        for (int i = 0; i < dTablesInfo.size(); i++) {
            System.out.println(dTablesInfo.get(i).getId() + "\t " + dTablesInfo.get(i).getState());
        }
        System.out.println("====显示完毕====");
    }

    public void orderDTable() {
        System.out.print("请输入预订餐桌id(-1返回)：");
        int id = Utility.readInt();
        if (id == -1)
            return;
        DiningTable dTable = DiningTableService.getDTableById(id);
        if (dTable == null) {
            System.out.println("无该餐桌");
            return;
        }
        if (!dTable.getState().equals("空")) {
            System.out.println("该餐桌已别预订或使用");
            return;
        }
        System.out.print("请输入预订人：");
        String orderName = Utility.readString(30);
        System.out.print("请输入预订人手机号：");
        String orderTel = Utility.readString(30);
        if (!DiningTableService.setDiningTabInfo(id, orderName, orderTel)) {
            System.out.println("预订失败");
        } else {
            System.out.println("预订成功");
        }
    }

    public void showMenu() {
        List<Menu> menus = MenuService.getMenu();
        System.out.println("id\tname\ttype\t price");
        for (Menu menu : menus) {
            System.out.println(menu.getId() + "\t" + menu.getName() + "\t" +
                    menu.getType() + "\t " + menu.getPrice());
        }
        System.out.println("======菜单显示完毕======");
    }

    public void orderDish() {
        System.out.println("请输入点餐餐桌号：");
        int diningTableId = Utility.readInt();
        DiningTable dTable = DiningTableService.getDTableById(diningTableId);
        if (dTable == null) {
            System.out.println("无该餐桌");
            return;
        }
        System.out.println("请输入菜品号：");
        int menuId = Utility.readInt();
        Menu dishInfo = MenuService.getDishInfoById(menuId);
        if (dishInfo == null) {
            System.out.println("无该菜品");
            return;
        }
        System.out.println("请输入点菜数量：");
        int nums = Utility.readInt();
        if (nums > 0) {
            if (BillService.insertBill(menuId, nums, diningTableId))
                System.out.println("点菜成功");
        } else System.out.println("点菜失败");
    }

    public void showBill() {
        List<Bill> bills = BillService.getBill();
        System.out.println("id\t billId\t menuId\t nums\t money\t diningTableId\t billDate\t state\t");
        for (int i = 0; i < bills.size(); i++) {
            Bill bill = bills.get(i);
            System.out.println(bill.getId() + "\t " + bill.getBillId() + "\t " + bill.getMenuId() + "\t "
                    + bill.getNums() + "\t " + bill.getMoney() + "\t " + bill.getDiningTableId() + "\t "
                    + bill.getBillDate() + "\t " + bill.getState());
        }
        System.out.println("===========账单显示完成==========");
    }

    public void payBill() {
        System.out.println("请输入结账餐桌号：");
        int diningTableId = Utility.readInt();
        DiningTable dTable = DiningTableService.getDTableById(diningTableId);
        if (dTable == null) {
            System.out.println("无该餐桌");
            return;
        }
        List<Bill> dTableBill = BillService.getDTableBill(diningTableId);
        if(dTableBill.size()==0) {
            System.out.println("该号桌无消费 自动结账成功");
            BillService.paySetBillFree(diningTableId,"null");
            return;
        }
        double sum = 0;
        System.out.println(diningTableId + "号餐桌的账单如下：");
        System.out.println("billId\t\t\t\t menuId\t nums\t money\t diningTable\t billDate");
        for (Bill bill : dTableBill) {
            System.out.println(bill.getBillId() + "\t\t\t\t " + bill.getMenuId() + "\t "
                    + bill.getNums() + "\t " + bill.getMoney() + "\t " + diningTableId + "\t " + bill.getBillDate());
            sum += bill.getMoney() * bill.getNums();
        }
        System.out.println(diningTableId + "号桌共消费" + sum + "元");
        System.out.println("==========账单显示完毕===========");
        System.out.println("请输入支付方式");
        String payWay = Utility.readString(30);

        if(BillService.paySetBillFree(diningTableId,payWay))
            System.out.println("支付成功");
        else System.out.println("支付失败");
    }
}
