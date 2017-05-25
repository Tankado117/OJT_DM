import java.util.*;

public class Hand
{
	public int cardNumber; 
	public  List<Card> cardList = new ArrayList<Card>();
	Table table = new Table();
	Card card = new Card();
	
	//カードを加える
	public void addCard(Card card){
		cardList.add(card);
	}

	//カードを引く
	public void drawCard(){
	
	}

	//同じ数のカードを探す
	public void searchCard(){
		//手札の枚数を取得
		cardNumber = cardList.size();
		int lastListNumber = cardNumber - 1;
		//リストの最後のカード情報を取得
		Card lastCard = cardList.get(lastListNumber);
		//リストの最後のカードの数字情報を取得
		int lastCardNumber = card.showNumber(lastCard);

		//同じ数字のものを探す
		for(int serchListNumber=0; serchListNumber<lastListNumber; serchListNumber++){
			Card serchCard = cardList.get(serchListNumber);
			int serchCardNumber = card.showNumber(serchCard);

			//同じ数字があった時
			if(serchCardNumber == lastCardNumber){
				table.dump(serchCard, lastCard, serchListNumber, lastListNumber, cardList);
			}
		}
	}

	//シャッフルする
	public void shuffleCard(){
		Collections.shuffle(cardList);	
	}

	//枚数を数える
	public int countCard(List<Card> cardList){
		cardNumber = cardList.size();
		return cardNumber;
	}
}