package com.mrkwinter.regexp;

import java.util.ArrayList;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Hose {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 0;
            }
        }
        houseTAround(arr, 1, 0, 0);
    }

    public static void houseTAround(int[][] arr, int step, int x, int y) {
        arr[x][y] = step;
        if (step == 64) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("============================");
            return;
        }
        ArrayList<Position> arrayList = getPostation(arr, x, y);
        sortArr(arr, arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            Position position = arrayList.get(i);
            houseTAround(arr, step + 1, position.getX(), position.getY());
            arr[position.getX()][position.getY()] = 0;
        }
    }

    public static ArrayList<Position> getPostation(int[][] arr, int x, int y) {
        ArrayList<Position> positions = new ArrayList<>();
        if (x + 2 >= 0 && x + 2 < 8 && y + 1 >= 0 &&
                y + 1 < 8 && arr[x + 2][y + 1] == 0) {
            positions.add(new Position(x + 2, y + 1));
        }
        if (x + 1 >= 0 && x + 1 < 8 && y + 2 >= 0 &&
                y + 2 < 8 && arr[x + 1][y + 2] == 0) {
            positions.add(new Position(x + 1, y + 2));
        }
        if (x - 1 >= 0 && x - 1 < 8 && y + 2 >= 0 &&
                y + 2 < 8 && arr[x - 1][y + 2] == 0) {
            positions.add(new Position(x - 1, y + 2));
        }
        if (x - 2 >= 0 && x - 2 < 8 && y + 1 >= 0 &&
                y + 1 < 8 && arr[x - 2][y + 1] == 0) {
            positions.add(new Position(x - 2, y + 1));
        }
        if (x - 2 >= 0 && x - 2 < 8 && y - 1 >= 0 &&
                y - 1 < 8 && arr[x - 2][y - 1] == 0) {
            positions.add(new Position(x - 2, y - 1));
        }
        if (x - 1 >= 0 && x - 1 < 8 && y - 2 >= 0 &&
                y - 2 < 8 && arr[x - 1][y - 2] == 0) {
            positions.add(new Position(x - 1, y - 2));
        }
        if (x + 1 >= 0 && x + 1 < 8 && y - 2 >= 0 &&
                y - 2 < 8 && arr[x + 1][y - 2] == 0) {
            positions.add(new Position(x + 1, y - 2));
        }
        if (x + 2 >= 0 && x + 2 < 8 && y - 1 >= 0 &&
                y - 1 < 8 && arr[x + 2][y - 1] == 0) {
            positions.add(new Position(x + 2, y - 1));
        }
        return positions;
    }

    public static void sortArr(int[][] arr, ArrayList<Position> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                Position position1 = arrayList.get(i);
                Position position2 = arrayList.get(i + 1);
                if (getPostation(arr, position1.getX(), position1.getY()).size()
                        > getPostation(arr, position1.getX(), position1.getY()).size()) {
                    arrayList.set(i,position2);
                    arrayList.set(i+1,position1);
                }
            }
        }
    }
}

class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
