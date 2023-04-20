package com.mrkwinter6;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Test4 {
    public static void main(String[] args) {

        Color c1 = Color.BLACK;
        switch (c1) {
            case RED:
                Color.RED.show();
                break;
            case BLUE:
                Color.BLUE.show();
                break;
            case BLACK:
                Color.BLACK.show();
                break;
            case GREEN:
                Color.GREEN.show();
                break;
            case YELLOW:
                Color.YELLOW.show();
                break;
            default:
                break;
        }
    }
}
@SuppressWarnings("all")
interface Print {
    public void show();
}
@SuppressWarnings("all")
enum Color implements Print {
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
}