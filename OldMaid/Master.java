public  class Master{
	
	Player player = new Player();
	public List<Player> nameList = new ArrayList<Player>();
	
	//参加プレイヤーを登録するメソッド
	private void registerPlayer(Player player){
		nameList.add(player);
	}

	//ゲームの準備をする
	private prepareGame(Hand trump){
		int flg = 0;
		trump.shuffleCard();

		//カードを配る
		for(int i = 0; i <= trump.length; i++){
			Card card = trump.drawCard;

			//配り先の切り替えをしつつ配る
			if(flg < 3){
				nameList.get(flg).distributeCard(card);
				flg = flg + 1;
			}
			else{
				flg = 0;
				nameList.get(flg).distributeCard(card);
				flg = flg + 1;
			}
		}
	}

	//ゲームを開始する
	private startGame(){
		Player player = nameList.get(0);
		Player player = nameList.get(1);
		player.nominate(nextPlayer);
	}
	
	//ゲームを終了する
	private endGame(){
		System.out.println( player.name +"さんが上がりました");
	}
}