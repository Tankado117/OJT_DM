public class Judge{
  String name;
  //ジャンケンを開始するメソッド
  public void startJanken(Player player1, Player player2){
    //ジャンケン開始宣言
    System.out.println("「ジャンケン開始」");
    //プレイヤーの名前
    String player1Name = player1.name;
    String player2Name = player2.name;

    for(int count = 1; count <=3; count++){
      //プレイヤーがジャンケンで出したもの
      String p1Hand = player1.showHand();
      String p2Hand = player2.showHand();
      //一回のジャンケンを判定後、ポイントを加算
      int getPoint = judgeBattle(p1Hand,p2Hand,player1Name,player2Name);
      if(getPoint == 1){
        player1.addPoint();
      }else if(getPoint == 2){
        player2.addPoint();
      }else{
      }
    }
    int p1Point = player1.Answer();
    int p2Point = player2.Answer();
    
    judgeGame(p1Point, p2Point);
  }
  //一回のジャンケンを判定するメソッド
  public int judgeBattle(String hand1 ,String hand2,String player1Name,String player2Name){
    System.out.println(hand1 +"VS"+ hand2);

    if( hand1 == "グー" && hand2 == "チョキ"){
        System.out.println( player1Name +"が勝ちました");
        return 1;
      }else if( hand1 == "チョキ" && hand2 == "パー"){
        System.out.println(player1Name+"が勝ちました");
        return 1;
      }else if( hand1 == "パー" && hand2 == "グー"){
        System.out.println(player1Name+"が勝ちました");
        return 1;
      }else if( hand1 == hand2){
        System.out.println(player1Name+"引き分けました");
        return 0;
      }else{
        System.out.println(player2Name+"が勝ちました");
        return 2;
      }
  }
  //最終的な勝負を判定するメソッド
  public void judgeGame(int p1point, int p2point){
    if ( p1point > p2point ) {
      System.out.println(p1point + "対" + p2point + "での勝ちです");
    }else if ( p1point == p2point ) {
      System.out.println( p1point + "対" + p2point + "で引き分けです");
    }else{
      System.out.println( p1point + "対" + p2point + "での勝ちです");
    }
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
