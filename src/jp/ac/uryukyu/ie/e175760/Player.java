package jp.ac.uryukyu.ie.e175760;

/*プレイする人の名前を登録するところ
理想はプレイヤーVSプレイヤーだったけど、その時入力する文字を画面上に表示しないやり方が分からなかったため今回はやめにした。
 */
class Player extends Tekazu{
    public Player(String name){
super(name);
    setFlag(false);
}


}