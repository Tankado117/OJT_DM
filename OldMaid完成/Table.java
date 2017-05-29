import java.util.ArrayList;
import java.util.List;

public class Table{
	//捨てられたカードをためる配列
	List<Card> dumpCardList = new ArrayList<Card>();

	//カードを捨てるメソッド
	public void dump(Card card1, Card card2, int dumpNumber1, int dumpNumber2, List<Card> cardList){
	//捨てられたカードを配列に追加する
		dumpCardList.add(card1);
		dumpCardList.add(card2);

		cardList.remove(card1);
		cardList.remove(card2);
	}
}