package com.mrkwinter01;

import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer goodName = new StringBuffer(scanner.next());
        double goodsPrice = scanner.nextDouble();
        Goods goods = new Goods(goodName,goodsPrice);
        System.out.println(goods);
    }
}
class Goods {
    private StringBuffer goodsName;
    private double goodsPrice;

    public Goods(StringBuffer goodsName, double goodsPrice) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }

    @Override
    public String toString() {
        String goodPriceString = Double.toString(this.goodsPrice);//将浮点数转换成String类
        StringBuffer goodsPrice = new StringBuffer(goodPriceString);//将String转换成StringBuffer类
        for (int index = goodsPrice.indexOf(".")-3;index>0;index-=3) {
            goodsPrice.insert(index,",");
        }
        return "商品名\t" + "商品价格\n" + goodsName + "\t" + goodsPrice + '\n';
    }
}