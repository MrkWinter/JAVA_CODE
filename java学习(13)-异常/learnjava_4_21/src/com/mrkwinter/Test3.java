package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
//主函数中调用除法函数 要求用主函数中传入的args 字符串数组作为参数
    //异常有  1 参数不够 （数组长度小于2） ArrayIndexOutOfBoundsException
    // 2 参数字符串不能转换成整数  NumberFormatException
    // 3 除数不能是0  ArithmeticException
    // 用try语句捕获 分别用catch 抓取 注意 父类异常写在后面
    //抛出异常的方式有手动抛出异常对象 和 系统判断异常类型 自动生成异常类
public class Test3 {
    public static void main(String[] args) {
        //先验证输入参数个数是否正确
        try {
            if(args.length!=2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1,n2); //若n2 == 0 该函数自动抛出异常到此
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch(NumberFormatException e) {
            System.out.println("参数格式不正确");
        } catch(ArithmeticException e) {
            System.out.println("出现除0 的情况");
        }
    }
    public static double cal( int n1,int n2) {
        return n1/n2;
    }
}
