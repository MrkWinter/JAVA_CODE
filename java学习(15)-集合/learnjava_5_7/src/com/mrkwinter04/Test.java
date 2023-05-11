package com.mrkwinter04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ////private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {}; //枚举常量
        //  public ArrayList() {
        //      this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA; //elementDate数组初始化
        // 使用无参构造器初始化ArrayList对象时 对象中的elementDate数组 (数据类型为Object类)被赋值为枚举常量默认为空的数组
        //  }

        for (int i = 0; i < 10; i++) {
            list.add(i);
            // 扩容底层
            // 1. 将i装箱
            // 2.   public boolean add(E e) {
            //        ensureCapacityInternal(size + 1);  // size是原数组中元素个数 用无参构造器第一次扩容时为0
            //         //该函数检测是否数组还能多放一个元素 若能不扩 若不能调用grow方法扩容
            //        elementData[size++] = e; // 将元素放进数组
            //        return true; //返回真
            //    }

            //3.  private void ensureCapacityInternal(int minCapacity) {
            //      ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
            //   //calculateCapacity函数是确定最低容量  ensureExplicitCapacity函数是判断是否扩容
            //  }
            //  private static int calculateCapacity(Object[] elementData, int minCapacity) {
            //        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            //            return Math.max(DEFAULT_CAPACITY, minCapacity);
            //        }
            //   //如果数组为空 返回10 和最低容量的最大值 针对数组为空的情况
            //        return minCapacity;
            //   //否则返回最低容量
            //    }

            //4 private void ensureExplicitCapacity(int minCapacity) {
            //      modCount++;
            //
            //      // 如果最低容量大于数组的最大容量 则进行扩容
            //      if (minCapacity - elementData.length > 0)
            //          grow(minCapacity);//根据最低容量进行扩容
            //  }

            //  5.private void grow(int minCapacity) {
            //        // 先保存数组最大容量 然后扩大1.5倍
            //        int oldCapacity = elementData.length;
            //        int newCapacity = oldCapacity + (oldCapacity >> 1);
            //        if (newCapacity - minCapacity < 0) //如果新数组容量还小于最低容量 则确定新数组容量为最低容量
            //        // 这里是针对旧数组的容量为0的情况制定的算法
            //            newCapacity = minCapacity;
            //        if (newCapacity - MAX_ARRAY_SIZE > 0)//这里是数组容量达到最大 调用方法进行解决
            //            newCapacity = hugeCapacity(minCapacity);
            //        // 用Array.copyOf方法将旧数组中元素拷贝并扩容(旧数组元素不够 拷贝null进行扩容)
            //        elementData = Arrays.copyOf(elementData, newCapacity);
            //    }



        }
        for (int i = 11; i < 20; i++) {
            list.add(i);
        }
    }
}
