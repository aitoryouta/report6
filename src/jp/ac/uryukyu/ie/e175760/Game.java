package jp.ac.uryukyu.ie.e175760;


    import java.util.Scanner;

    public class Game{
        public static void main(String[] argst){
            int s[]=new int[5];
//Scannerクラスのインスタンスの生成
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<s.length;i++){
                System.out.println("整数を入力");
//整数をキーボードから入力し、配列に記憶
                s[i]= sc.nextInt();
            }
            for(int i=0;i<s.length;i++){
                System.out.printf("s[%2d]=%d\n",i,s[i]);
            }
        }
    }
