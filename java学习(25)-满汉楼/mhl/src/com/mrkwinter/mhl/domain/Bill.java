package com.mrkwinter.mhl.domain;

import java.util.Date;

/**
 * @author MrkWinter
 * @version 1.0
 * #账单流水, 考虑可以分开结账, 并考虑将来分别统计各个不同菜品的销售情况
 * create table bill (
 * 	id int primary key auto_increment, #自增主键
 * 	billId varchar(50) not null default '',#账单号可以按照自己规则生成 UUID
 * 	menuId int not null default 0,#菜品的编号, 也可以使用外键
 * 	nums SMALLINT not null default 0,#份数
 * 	money double not null default 0, #金额
 * 	diningTableId int not null default 0, #餐桌
 * 	billDate datetime not null ,#订单日期
 * 	state varchar(50) not null default '' # 状态 '未结账' , '已经结账', '挂单'
 * )charset=utf8;
 */
public class Bill {
    private Integer id;
    private String billId;
    private Integer menuId;
    private Integer nums;
    private double money;
    private Integer diningTableId;
    private Date billDate;
    private String state;

    public Bill() {
    }

    public Bill(Integer id, String billId, Integer menuId, Integer nums, double money, Integer diningTableId, Date billDate, String state) {
        this.id = id;
        this.billId = billId;
        this.menuId = menuId;
        this.nums = nums;
        this.money = money;
        this.diningTableId = diningTableId;
        this.billDate = billDate;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getDiningTableId() {
        return diningTableId;
    }

    public void setDiningTableId(Integer diningTableId) {
        this.diningTableId = diningTableId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billId='" + billId + '\'' +
                ", menuId=" + menuId +
                ", nums=" + nums +
                ", money=" + money +
                ", diningTableId=" + diningTableId +
                ", billDate=" + billDate +
                ", state='" + state + '\'' +
                '}';
    }
}
