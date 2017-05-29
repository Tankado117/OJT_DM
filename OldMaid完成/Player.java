public class Player
{
    String name;
    Hand hand = new Hand();
    Master master;
	Table field;
    public Player(String name, Master master, Table field){
		this.name = name;
    	//修正箇所③ masterの代入し忘れ
    	this.master = master;
		this.field = field;
	}

    //カードを配る
    public void distributeCard(Card card){
        hand.addCard(card);
        hand.searchCard(field, name);	
    }

  //順番を指名する
//    public void nominate(Player player, Player nextplayer, List<Player> nameList){
//    	int participant = nameList.size();//参加者人数
//    	while(participant != 0){
//
//    		//隣のプレイヤーを呼んで、手札を出してもらう
//    		Hand nextHand = nextplayer.putHand();
//
//    		//出してもらった手札から、カードを引かせてもらう
//    		Card nextCard = nextHand.drawCard();
//
//    		//引いたカードを、自分の手札に加える
//    		hand.addCard(nextCard);
//
//    		//同じカードがあったら捨てる処理を呼ぶ
//    		hand.searchCard(field);
//
//    		//もし、手札がなかったら上がりを進行役に宣言する
//    		int cardNumber = hand.countCard();//残りの枚数
//    		if(cardNumber == 0){
//    			//終わりを宣言
//    			master.endGame(this);
//    		}
//    	}
//    }

	//修正箇所⑤
	//１人のプレイヤーの、１ターンの処理を書くだけでよい
	//よってループはしない

	//順番を指名する
    public void nominate(Player player, Player nextplayer){

		System.out.println(player.name + "さんの番です");

    	//隣のプレイヤーを呼んで、手札を出してもらう
		Hand nextHand = nextplayer.putHand();

		//出してもらった手札から、カードを引かせてもらう
		Card nextCard = nextHand.drawCard();

		if(nextCard.number == 0){
			   		System.out.println(player.name + ":" + nextplayer.name + "から" + nextCard.ShowSuit() +"を引きました");
		}
		else{
    		System.out.println(player.name + ":" + nextplayer.name + "から" + nextCard.ShowSuit() + nextCard.showNumber() + "を引きました");
		}

		//引いたカードを、自分の手札に加える
		hand.addCard(nextCard);

		//同じカードがあったら捨てる処理を呼ぶ
		hand.searchCard(field, name);

		System.out.print(player.name + ":残りの手札は　");

		for(Card c: hand.cardList){

			if(c.showNumber() == 0){
				System.out.print(c.ShowSuit() + "　");
			}
			else{
				System.out.print(c.ShowSuit() + c.showNumber() + "　");
			}
		}
		System.out.println("です。\n");


		//もし、手札がなかったら上がりを進行役に宣言する
		if(hand.countCard() == 0){
			//終わりを宣言
			master.endGame(this);
		}
    }

    //手札を出す
    private Hand putHand(){

    	//修正箇所⑥
    	//相手に最後のカードを引かれて上がる処理が書かれていない
    	//手札を相手に出した時残り一枚なら、上がり
    	if(hand.countCard()==1){
    		master.endGame(this);
    	}
    	//見せる前にシャッフルする
    	hand.shuffleCard();

    	return hand;
    }
}
