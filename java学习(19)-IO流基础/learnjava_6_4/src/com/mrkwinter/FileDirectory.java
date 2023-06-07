package com.mrkwinter;

import org.junit.Test;

import java.io.File;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FileDirectory {
    public static void main(String[] args) {

    }
    //删除文件操作
    @Test
    public void m1() {
        File file = new File("text.txt");
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("删除成功");
            }
        } else {
            System.out.println("文件不存在");
        }
    }
    //删除目录操作
    @Test
    public void m2() {
        File file2 = new File("file2");
        if(file2.exists()) {
            if(file2.delete()) {
                System.out.println("删除成功");
            }
        } else {
            System.out.println("删除失败");
        }
    }
    //创建一级目录(mkdir)多级目录(mkdirs)
    @Test
    public void m3() {
        File file2 = new File("file2\\file3");
        if(file2.exists()) {
            System.out.println("目录文件存在");
        } else {
            if (file2.mkdirs()) {
                System.out.println("目录创建成功");
            }else  {
                System.out.println("目录创建失败");
            }
        }
    }
}
