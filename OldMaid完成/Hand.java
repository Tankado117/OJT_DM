import java.util.*;

public class Hand
{
	public  List<Card> cardList = new ArrayList<Card>();
	
	//�J�[�h��������
	public void addCard(Card card){
		cardList.add(card);
	}

	//�J�[�h������
	public Card drawCard(){
		return (Card)cardList.remove(0);
	}

	//�������̃J�[�h��T��
	public void searchCard(Table field, String name){
		//��D�̖������擾
		int cardNumber = cardList.size();
		int lastListNumber = cardNumber - 1;
		//���X�g�̍Ō�̃J�[�h�����擾
		Card lastCard = cardList.get(lastListNumber);
		//���X�g�̍Ō�̃J�[�h�̐��������擾
		int lastCardNumber = lastCard.showNumber();
		//���������̂��̂�T��
		for(int serchListNumber=0; serchListNumber<lastListNumber; serchListNumber++){
			Card serchCard = cardList.get(serchListNumber);
			int serchCardNumber = serchCard.showNumber();
			//������������������
			if(serchCardNumber == lastCardNumber){
				System.out.println(name + ":"+ serchCard.ShowSuit() + serchCard.number +","+ lastCard.ShowSuit() + lastCard.number + "���̂Ă܂���");

				field.dump(serchCard, lastCard, serchListNumber, lastListNumber, cardList);
				
				//�C���ӏ��@
				//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
				//��L��O�̉�����
				//�J�[�h���̂Ă����Ƃɂ��A�J�[�h�̍ő咷���������Ȃ�AserchListNumber<lastListNumber �̕����Ŕ͈͊O���Q�Ƃ��Ă��܂�
				//�� �����J�[�h�������Ď̂Ă���A���[�v�𔲂���悤�ɂ���
				break;
			}
		}
	}

	//�V���b�t������
	public void shuffleCard(){
		Collections.shuffle(cardList);	
	}

	//�����𐔂���
	public int countCard(){
		return cardList.size();
	}
}