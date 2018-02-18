package jp.ac.uryukyu.ie.e175760;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Tekazu tekazu = new Tekazu("playaer");
        int count = 0;
        System.out.println("じゃんけんを開始します。\n「グー」なら１\n「チョキ」なら２\n「パー」なら３を入力してください");
        while (!tekazu.isFlag()) {
            count++;
            System.out.println(count + "回戦目");
            tekazu.attack();

        }


        System.out.println("終わりですよー");

   /* int[] s = new int[1];

    public Data(int[] data_1){
        this.s= data_1;

        public int getAttack(){return attack;}

        public void setAttack(int attack){this.attack=attack;}


    }*/

    }


}