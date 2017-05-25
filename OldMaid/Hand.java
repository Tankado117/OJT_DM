import java.util.*;

public class Hand
{
	public int cardNumber;
	public  List<Card> cardList = new ArrayList<Card>();
	Table table = new Table();
	
	//カードを加える
	public void addCard(Card card){
		cardList.add(card);
	}

	//カードを引く
	public void drawCard(){
	
	}

	//同じ数のカードを探す
	public void searchCard(Card card){
		int lastListNumber = cardList.size(); 
		Card lastCard = cardList.get(lastListNumber); //直前に追加したカード
		int lastCardNumber = lastCard.number; //直前に追加したカードの数字
		int serchCardNumber = cardList.number.indexOf(lastCardNumber);

		if(serchCardNumber != -1){
			Card dumpCard1 = cardList.get(serchCardNumber);
			Card dumpCard2 = cardList.get(lastCardNumber);

			table.dump(dumpCard1, dumpCard2, serchCardNumber, lastListNumber, cardList);
		}



	}

	//シャッフルする
	public void shuffleCard(){
	
	}

	//枚数を数える
	public void countCard(){
	
	}
}