import java.util.*;

public class Table{
	//�̂Ă�ꂽ�J�[�h�����߂�z��
	List<Card> dumpCardList = new ArrayList<Card>();
	//�J�[�h���̂Ă郁�\�b�h
	public void dump(Card card1, Card card2){
	//�̂Ă�ꂽ�J�[�h��z��ɒǉ�����
		dumpCardList.add(card1);
		dumpCardList.add(card2);
	}
}