import java.util.*;

public class Table{
	//�̂Ă�ꂽ�J�[�h�����߂�z��
	List<Card> dumpCardList = new ArrayList<Card>();
	Hand hand = new Hand();

	//�J�[�h���̂Ă郁�\�b�h
	public void dump(Card card1, Card card2, int dumpNumber1, int dumpNumber2, List<Card> cardList){
	//�̂Ă�ꂽ�J�[�h��z��ɒǉ�����
		dumpCardList.add(card1);
		dumpCardList.add(card2);
		
		cardList.remove(dumpNumber1);
		cardList.remove(dumpNumber2);
	}
}