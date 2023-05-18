package com.mrkwinter;

import java.util.LinkedList;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class LinkedList_01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //1 调用无参构造器
        //    public LinkedList() {
        //    }
        linkedList.add(1);
        //2 调用add函数
        //public boolean add(E e) {
        //        linkLast(e);
        //        return true;
        //    }

        //3 linkLast函数
        //    void linkLast(E e) {
        //        final Node<E> l = last;
        //        final Node<E> newNode = new Node<>(l, e, null);
        //        last = newNode;
        //        if (l == null)
        //            first = newNode;
        //        else
        //            l.next = newNode;
        //        size++;
        //        modCount++;
        //    }
    }
}
