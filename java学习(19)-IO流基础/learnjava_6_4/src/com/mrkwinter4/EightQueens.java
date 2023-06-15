package com.mrkwinter4;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class EightQueens {
    public static int count = 0;
    public static void main(String[] args) {
        int[] board = new int[8];//0 ~ 7 下标代表0~7行 对应的值代表每一行的位置
        new EightQueens().eightQueueQuestion(board, 0);
    }
    public void eightQueueQuestion(int[] board, int n) { //n表示行数
        if(n==8) { //找到最后一行并确定后
            System.out.println("第" + (++count) + "种情况");
            printBoard(board); //打印数组
            return;
        }
        for (int i = 0; i < 8; i++) {
            board[n] = i;//放入对应的n行 i列代表的位置
            if (suitable(board, n)) { //若该数组中前n-1行和 第n行不冲突 则放入位置合适 到此放入一个
             eightQueueQuestion(board,n+1); //找到下一行的正确位置
            }
        }
    }
    public boolean suitable(int[] board, int n) {
        for (int i = 0; i < n; i++) {
            if(board[i] == board[n] || Math.abs(n-i) == Math.abs(board[n]-board[i]))
                return false;
        }
        return true;
    }
    public void printBoard(int[] board) {
        int boardRowAndCol = board.length;
        for (int i = boardRowAndCol-1; i >=0; i--) { //从最后一行开始打印
            int queenStation = board[i];//皇后的位置
            for (int j = 0; j < boardRowAndCol; j++) {
                if(j == queenStation) {
                    System.out.print("Q ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();//换行
        }
    }
}
