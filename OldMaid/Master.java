public  class Master{
	
	private List<Player> nameList = new ArrayList<Player>();
	
	//�Q���v���C���[��o�^���郁�\�b�h
	private void registerPlayer(Player player){
		nameList.add(player);
	}
	private prepareGame(Hand trump){
		trump.shuffleCard();
		for(int i = 0; i < trump.length; i++){
			Card card = trump.drawCard;
			nameList.get(i).sendCard(card);
		}
	}
	private startGame(){
		
		
	}
	private endGame(){
		
	}
}