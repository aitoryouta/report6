package jp.ac.uryukyu.ie.e175760;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Test{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] s = new int[1];
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {



for (int i = 0; ; i++)

    {
        System.out.println("じゃんけんを開始します。\n「グー」なら「１」\n「チョキ」なら「２」\n「パー」なら「３」を入力してください");
        System.out.print((i + 1) + "回目 : ");
        int[] s = new int[1];

        int p = 0;
        int rando = (int) (Math.random() * 3);
        try {
            Scanner scanner = new Scanner(System.in);
            p = scanner.nextInt();

        } catch (NumberFormatException e) {
            System.err.println("数値を入力してください(例：グーの場合は”1”を入力))");
            i--;
        } catch (Exception e) {
            System.err.println("もう一度入力してください");
            i--;
        }
    }}}