public  class Master{
	
	private List<Player> nameList = new ArrayList<Player>();
	
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

	private startGame(){
		
		
	}
	private endGame(){
		
	}
}