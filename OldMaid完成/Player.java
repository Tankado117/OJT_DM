public class Player
{
    String name;
    Hand hand = new Hand();
    Master master;
	Table field;
    public Player(String name, Master master, Table field){
		this.name = name;
    	//�C���ӏ��B master�̑�����Y��
    	this.master = master;
		this.field = field;
	}

    //�J�[�h��z��
    public void distributeCard(Card card){
        hand.addCard(card);
        hand.searchCard(field, name);	
    }

  //���Ԃ��w������
//    public void nominate(Player player, Player nextplayer, List<Player> nameList){
//    	int participant = nameList.size();//�Q���Ґl��
//    	while(participant != 0){
//
//    		//�ׂ̃v���C���[���Ă�ŁA��D���o���Ă��炤
//    		Hand nextHand = nextplayer.putHand();
//
//    		//�o���Ă��������D����A�J�[�h���������Ă��炤
//    		Card nextCard = nextHand.drawCard();
//
//    		//�������J�[�h���A�����̎�D�ɉ�����
//    		hand.addCard(nextCard);
//
//    		//�����J�[�h����������̂Ă鏈�����Ă�
//    		hand.searchCard(field);
//
//    		//�����A��D���Ȃ�������オ���i�s���ɐ錾����
//    		int cardNumber = hand.countCard();//�c��̖���
//    		if(cardNumber == 0){
//    			//�I����錾
//    			master.endGame(this);
//    		}
//    	}
//    }

	//�C���ӏ��D
	//�P�l�̃v���C���[�́A�P�^�[���̏��������������ł悢
	//����ă��[�v�͂��Ȃ�

	//���Ԃ��w������
    public void nominate(Player player, Player nextplayer){

		System.out.println(player.name + "����̔Ԃł�");

    	//�ׂ̃v���C���[���Ă�ŁA��D���o���Ă��炤
		Hand nextHand = nextplayer.putHand();

		//�o���Ă��������D����A�J�[�h���������Ă��炤
		Card nextCard = nextHand.drawCard();

		if(nextCard.number == 0){
			   		System.out.println(player.name + ":" + nextplayer.name + "����" + nextCard.ShowSuit() +"�������܂���");
		}
		else{
    		System.out.println(player.name + ":" + nextplayer.name + "����" + nextCard.ShowSuit() + nextCard.showNumber() + "�������܂���");
		}

		//�������J�[�h���A�����̎�D�ɉ�����
		hand.addCard(nextCard);

		//�����J�[�h����������̂Ă鏈�����Ă�
		hand.searchCard(field, name);

		System.out.print(player.name + ":�c��̎�D�́@");

		for(Card c: hand.cardList){

			if(c.showNumber() == 0){
				System.out.print(c.ShowSuit() + "�@");
			}
			else{
				System.out.print(c.ShowSuit() + c.showNumber() + "�@");
			}
		}
		System.out.println("�ł��B\n");


		//�����A��D���Ȃ�������オ���i�s���ɐ錾����
		if(hand.countCard() == 0){
			//�I����錾
			master.endGame(this);
		}
    }

    //��D���o��
    private Hand putHand(){

    	//�C���ӏ��E
    	//����ɍŌ�̃J�[�h��������ďオ�鏈����������Ă��Ȃ�
    	//��D�𑊎�ɏo�������c��ꖇ�Ȃ�A�オ��
    	if(hand.countCard()==1){
    		master.endGame(this);
    	}
    	//������O�ɃV���b�t������
    	hand.shuffleCard();

    	return hand;
    }
}
