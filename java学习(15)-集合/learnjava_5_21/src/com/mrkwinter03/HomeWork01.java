package com.mrkwinter03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class HomeWork01 {
    public static void main(String[] args) {
        news news = new news("新冠确诊病例千万，数百万印度教徒奔赴恒河，引起民众担忧");
        news news1 = new news("男子突然想起两个月前钓的鱼还在兜里，急忙回家找到放生");
        ArrayList arrayList = new ArrayList();
        arrayList.add(news);
        arrayList.add(news1);
        Collections.reverse(arrayList);
        for (Object o : arrayList) {
            news o1;
            if((o1 =(news)o).getTitle().length()>15) {
                o1.setTitle(o1.getTitle().substring(0,15) + "...");
            }
            System.out.println(o);
        }
    }
}
class news {
    private String title;
    private String content;

    public news(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "news{" +
                "title='" + title + '\'' +
                '}';
    }
}