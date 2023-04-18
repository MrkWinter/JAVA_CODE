package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}

class Season {
    private String season;
    private String feature;
    public final static Season SPRING = new Season("Spring", "温暖");
    public final static Season SUMMER = new Season("Summer", "炎热");
    public final static Season AUTUMN = new Season("Autumn", "凉爽");
    public final static Season WINTER = new Season("Winter", "寒冷");

    private Season(String season, String feature) {
        this.season = season;
        this.feature = feature;
    }

    public String getSeason() {
        return season;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "season='" + season + '\'' +
                ", feature='" + feature + '\'' +
                '}';
    }
}