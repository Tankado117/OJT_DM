import java.util.*;

public class Hand
{
	public int cardNumber; 
	public  List<Card> cardList = new ArrayList<Card>();
	Table table = new Table();
	Card card = new Card();
	
	//�J�[�h��������
	public void addCard(Card card){
		cardList.add(card);
	}

	//�J�[�h������
	public void drawCard(){
	
	}

	//�������̃J�[�h��T��
	public void searchCard(){
		//��D�̖������擾
		cardNumber = cardList.size();
		int lastListNumber = cardNumber - 1;
		//���X�g�̍Ō�̃J�[�h�����擾
		Card lastCard = cardList.get(lastListNumber);
		//���X�g�̍Ō�̃J�[�h�̐��������擾
		int lastCardNumber = card.showNumber(lastCard);

		//���������̂��̂�T��
		for(int serchListNumber=0; serchListNumber<lastListNumber; serchListNumber++){
			Card serchCard = cardList.get(serchListNumber);
			int serchCardNumber = card.showNumber(serchCard);

			//������������������
			if(serchCardNumber == lastCardNumber){
				table.dump(serchCard, lastCard, serchListNumber, lastListNumber, cardList);
			}
		}
	}

	//�V���b�t������
	public void shuffleCard(){
		Collections.shuffle(cardList);	
	}

	//�����𐔂���
	public int countCard(List<Card> cardList){
		cardNumber = cardList.size();
		return cardNumber;
	}
}