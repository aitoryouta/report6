package jp.ac.uryukyu.ie.e175760;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Tekazu tekazu = new Tekazu("player");
        int count = 0;
        System.out.println("じゃんけんを開始します。\n「グー」なら１\n「チョキ」なら２\n「パー」なら３を入力してください");
        while (!tekazu.isFlag()) {
            count++;
            System.out.println(count + "回目:選んだ数字を入力してください\n");
            tekazu.attack();

        }

        System.out.println("それではゲームを開始してください");


    }


}