import java.util.*;

public class Hand
{
	public  List<Card> cardList = new ArrayList<Card>();
	
	//カードを加える
	public void addCard(Card card){
		cardList.add(card);
	}

	//カードを引く
	public Card drawCard(){
		return (Card)cardList.remove(0);
	}

	//同じ数のカードを探す
	public void searchCard(Table field, String name){
		//手札の枚数を取得
		int cardNumber = cardList.size();
		int lastListNumber = cardNumber - 1;
		//リストの最後のカード情報を取得
		Card lastCard = cardList.get(lastListNumber);
		//リストの最後のカードの数字情報を取得
		int lastCardNumber = lastCard.showNumber();
		//同じ数字のものを探す
		for(int serchListNumber=0; serchListNumber<lastListNumber; serchListNumber++){
			Card serchCard = cardList.get(serchListNumber);
			int serchCardNumber = serchCard.showNumber();
			//同じ数字があった時
			if(serchCardNumber == lastCardNumber){
				System.out.println(name + ":"+ serchCard.ShowSuit() + serchCard.number +","+ lastCard.ShowSuit() + lastCard.number + "を捨てました");

				field.dump(serchCard, lastCard, serchListNumber, lastListNumber, cardList);
				
				//修正箇所①
				//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
				//上記例外の解決策
				//カードを捨てたことにより、カードの最大長が小さくなり、serchListNumber<lastListNumber の部分で範囲外を参照してしまう
				//↓ 同じカードを見つけて捨てたら、ループを抜けるようにする
				break;
			}
		}
	}

	//シャッフルする
	public void shuffleCard(){
		Collections.shuffle(cardList);	
	}

	//枚数を数える
	public int countCard(){
		return cardList.size();
	}
}