package jp.ac.uryukyu.ie.e175760;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Tekazu {
    String name;
    public boolean flag;



    public Tekazu(String name) {
       this.name = name;
        flag = false;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean dead) {
        this.flag = flag;
    }


    public void attack() {

        int rando = (int) (Math.random() * 3);
        String judge = "勝ちました!!"+getName()+"が先攻です!!\n";
        String judge_1="負けました..."+getName()+"が後攻です\n";
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            int p = scanner.nextInt();
            ///int rando= scanner.nextInt();

            if (p < 4 && p > 0) {


                if (p != rando) {
                    flag = true;

                        switch (p) {
                            case 1:
                                System.out.println("あなたはグーです！");
                                if (rando == 2) {
                                    System.out.println(judge);
                                } else {
                                    System.out.println(judge_1);
                                }
                                break;
                            case 2:
                                System.out.println("あなたはチョキです！");
                                if (rando == 1) {
                                    System.out.println(judge_1);
                                }else{
                                    System.out.println(judge);
                                }
                                break;
                            case 3:
                                System.out.println("あなたはパーです！");
                                if (rando == 1) {
                                    System.out.println(judge);
                                }else{
                                    System.out.println(judge_1);
                                }
                                break;
                                }

                    if (p == rando) {
                        flag = false;
                        System.out.println("あいこです!!\n");
                        System.out.println("もう一度出す手を入力しよう！！！");
                    }
                }
            }else{
                System.out.println("入力エラーです！！\n１〜３までの数字しか選べないよ！！！\n入力した数字を確認してもう一度入力してください！");
            }


        }catch (InputMismatchException e) {
            System.out.println("型が違います！！！：" );
                System.out.println("１〜３までの数字しか選べないよ！！！");
                System.out.println("入力した数字を確認してもう一度入力してください");

            }
        }
    }

/* switch (式){
  case 定数1:
    実行する文1;
    実行する文2;
    ...
    break;
  case 定数2:
    実行する文1;
    実行する文2;
    ...
    break;
*/

