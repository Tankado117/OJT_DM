public class Player{
  //名前のインスタンス変数
  String name;
  //勝ったポイントを覚えておくためのインスタンス変数
  int point = 0;
  //手の出し方を決めるメソッド
  public Player(String name){
    this.name = name;
  }
  public String showHand(){
   double r = Math.random() * 3;

   String j =  doJanken(r);

  return j;
  }
 //ランダムの数字に出し方を割り当てるメソッド
  public String doJanken(double r){
    if (0<= r && r < 1){
      return  "グー";
    }else if(1<= r && r < 2){
      return  "チョキ";
    }else{
      return  "パー";
    }
  }
  //勝った回数を覚えるメソッド
  public void addPoint(){
    point++;
  }
  //勝った回数を答える
  public int Answer(){
    return point;
  }

}
/*斉藤：「わかりました。ジャンケン3回勝負をはじめます！」

斉藤：「まず1回戦。ジャンケン、ポン！」
村田：「パー！」
山田：「チョキ！」
斉藤：「はい、山田さんの勝ちです」

斉藤：「次に2回戦。ジャンケン、ポン！」
				・
				・
斉藤：「3回勝負が終わりました。勝った回数を聞きます」
斉藤：「村田さんは何回勝ちましたか？」
村田：「1回です」
斉藤：「山田さんは何回勝ちましたか？」
山田：「2回です」

斉藤：「2対1で、山田さんの勝ちです！」*/
