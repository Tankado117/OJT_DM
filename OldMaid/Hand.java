import java.util.*;

public class Hand
{
	public int cardNumber;
	public  List<Card> cardList = new ArrayList<Card>();
	Table table = new Table();
	
	//�J�[�h��������
	public void addCard(Card card){
		cardList.add(card);
	}

	//�J�[�h������
	public void drawCard(){
	
	}

	//�������̃J�[�h��T��
	public void searchCard(Card card){
		int lastListNumber = cardList.size(); 
		Card lastCard = cardList.get(lastListNumber); //���O�ɒǉ������J�[�h
		int lastCardNumber = lastCard.number; //���O�ɒǉ������J�[�h�̐���
		int serchCardNumber = cardList.number.indexOf(lastCardNumber);

		if(serchCardNumber != -1){
			Card dumpCard1 = cardList.get(serchCardNumber);
			Card dumpCard2 = cardList.get(lastCardNumber);

			table.dump(dumpCard1, dumpCard2, serchCardNumber, lastListNumber, cardList);
		}



	}

	//�V���b�t������
	public void shuffleCard(){
	
	}

	//�����𐔂���
	public void countCard(){
	
	}
}