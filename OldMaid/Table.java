import java.util.*;

public class Table{
	//捨てられたカードをためる配列
	List<Card> dumpCardList = new ArrayList<Card>();
	//カードを捨てるメソッド
	public void dump(Card card1, Card card2){
	//捨てられたカードを配列に追加する
		dumpCardList.add(card1);
		dumpCardList.add(card2);
	}
}