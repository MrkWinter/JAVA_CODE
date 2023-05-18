package com.mrkwinter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet_02 {
    //1.构造器源码本质上走得是hashmap
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("hashset"+ hashSet);
        //1.构造器的调用
        //    public HashSet() {
        //        map = new HashMap<>();
        //    }
        //2.调用add方法
        //    public boolean add(E e) {
        //        return map.put(e, PRESENT)==null;
        //   //map是HashSet中定义的一个hashmap对象 可以调用hashmap中的put方法
        //   //PRESENT 是一个Object对象 起到占位的作用
        //    }
        //
        // put方法
        //    public V put(K key, V value) {
        //   //该方法会执行hash(key) 得到key对应的hash值 哈希值并不等于hashcode
        //   //返回null表示根据所给元素生成的对应的哈希值找到在HashMapNode数组中对应的索引位置为空 表示添加成功
        //        return putVal(hash(key), key, value, false, true);
        //    }
        //3.putVal方法
        //final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
        //                   boolean evict) {
        //        Node<K,V>[] tab; Node<K,V> p; int n, i; //辅助性数值 Node数组：存放元素的数组
        //        if ((tab = table) == null || (n = tab.length) == 0) //table 数组HashMap中的属性 用于存放元素的Node数组 刚开始为空
        //            n = (tab = resize()).length; //resize()在第一次返回一个16元素大小的Node数组 (扩容)
        //        if ((p = tab[i = (n - 1) & hash]) == null) //同过哈希值在数组中找到对应的位置元素 并把这个元素赋给辅助变量p 如果p为空直接放进数组
        //            tab[i] = newNode(hash, key, value, null); //hash值要存储是因为可能要比较hash值
        //        else { //所存位置已有元素情况
        //            Node<K,V> e; K k;
        //           //1.Node数组中取出的对应元素的哈希值和所存元素的哈希值相同
        //           //2.Node数组中取出的对应元素和所存元素是同一个元素
        //           //2.当前要存入元素不为空的情况下调用对应的equals方法(可能比较值 可能比较地址)和Node数组中取出的对应元素比较
        //           //1 2 同时成立 进入if语句 将Node数组中取出的p赋值给e (e指向Node数组中对应的元素) 也就是说元素判定相同 不再Node数组或链表中存储
        //            if (p.hash == hash &&
        //                ((k = p.key) == key || (key != null && key.equals(k))))
        //                e = p;
        //           // 判断是否为红黑树 进行红黑树的算法处理
        //            else if (p instanceof TreeNode)
        //                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        //            //前面两个判断条件不进入 说明该元素在对应位置哈希值相同 且元素内容和Node数组中对应的元素不同 需要进行链式元素判断和存储
        //            else {  //在循环遍历链表中若出现有和当前元素相同的 直接不再加入元素 若遍历链表后为有相同 直接在链表后加入新元素
        //                for (int binCount = 0; ; ++binCount) {
        //                    if ((e = p.next) == null) { //直到将链表遍历 为空时 将元素添加到链表尾部
        //                        p.next = newNode(hash, key, value, null);
        //                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st  调用方法将当前链表进行红黑树化
        //                            treeifyBin(tab, hash);   //  如果表长小于64 就先进行扩容 只有当 if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)resize();
        //                                                     // 这个条件不成立时 才进行表的树化
        //                        break;
        //                    }
        //                    if (e.hash == hash &&   //如果在链表中访问到的元素和当前元素判定义相同 直接退出 放弃添加
        //                        ((k = e.key) == key || (key != null && key.equals(k))))
        //                        break;
        //                    p = e;
        //                }
        //            }
        //            if (e != null) { // existing mapping for key
        //                V oldValue = e.value;
        //                if (!onlyIfAbsent || oldValue == null)
        //                    e.value = value;
        //                afterNodeAccess(e);
        //                return oldValue; //添加失败
        //            }
        //        }
        //        ++modCount;
        //        if (++size > threshold) //元素大小是否大于闸值 大于准备扩容
        //            resize();
        //        afterNodeInsertion(evict);//跟子类有关
        //        return null;  //添加成功
        //    }
    }
}
