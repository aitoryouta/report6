package jp.ac.uryukyu.ie.e175760;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Tekazu {
    private String name;
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
        String judge = "じゃんけんの結果：勝ちました!!\n"+getName()+"が先攻です!!\n";
        String judge_1="じゃんけんの結果：負けました...\n"+getName()+"が後攻です\n";
        try {
            ///この部分で入力を受け付けている。と同時に例外処理を行なっていて、int以外の型が入力された時にエラーば出るようになっている。
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            int p = scanner.nextInt();
            /*int rando= scanner.nextInt();
            * この部分でもうPLAYER対PLAYERを行いたいと思ったが
            * 入力される数字を画面上に出力しないで数字だけを受け取るやり方がわからなかったため
            * 実装部分だけ残した。やり方がわかった時ように実行できるように残しておく*/
            if (p < 4 && p > 0) {
                if (p != rando) {
                    flag = true;

                        switch (p) {
                            case 1:
                                System.out.println("あなたはグーを選びました！");
                                if (rando == 2) {
                                    System.out.println(judge);
                                } else {
                                    System.out.println(judge_1);
                                }
                                break;
                            case 2:
                                System.out.println("あなたはチョキを選びました！");
                                if (rando == 1) {
                                    System.out.println(judge_1);
                                }else{
                                    System.out.println(judge);
                                }
                                break;
                            case 3:
                                System.out.println("あなたはパーを選びました！");
                                if (rando == 1) {
                                    System.out.println(judge);
                                }else{
                                    System.out.println(judge_1);
                                }
                                break;
                                }
                    }
                else if (p == rando) {
                    flag = false;
                    System.out.println("じゃんけんの結果:あいこです!!\n");
                    System.out.println("もう一度出す手を入力しよう！！！");
                }
            }else{
                /*例外処理自体ではintの型を全て受け取ってしまうので、それ以外の条件をif文で書いた。
                * そうする事で１〜３までの数字しか受け取らないようになっている*/
                System.out.println("入力エラーです！！\n１〜３までの数字しか選べないよ！！！\n入力した数字を確認してもう一度入力してください！");
            }
        }catch (InputMismatchException e) {
            ///ここで例外をキャッチ！今回は上でも書いてある通り、int以外の型が入力された時の例外。
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

