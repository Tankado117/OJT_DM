public  class Master{
	
	Player player = new Player();
	public List<Player> nameList = new ArrayList<Player>();
	
	//�Q���v���C���[��o�^���郁�\�b�h
	private void registerPlayer(Player player){
		nameList.add(player);
	}

	//�Q�[���̏���������
	private prepareGame(Hand trump){
		int flg = 0;
		trump.shuffleCard();

		//�J�[�h��z��
		for(int i = 0; i <= trump.length; i++){
			Card card = trump.drawCard;

			//�z���̐؂�ւ������z��
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

	//�Q�[�����J�n����
	private startGame(){
		Player player = nameList.get(0);
		Player player = nameList.get(1);
		player.nominate(nextPlayer);
	}
	
	//�Q�[�����I������
	private endGame(){
		System.out.println( player.name +"���񂪏オ��܂���");
	}
}