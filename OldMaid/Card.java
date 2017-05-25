public class Card
{
	//カードの数字、スートを格納
	private int number;
	private int suit;

	//カード生成のための変数
	public static int JOKER = 0;
	public static int SUIT_CLUB = 1;
	public static int SUIT_DIAMOND = 2;
	public static int SUIT_HEART = 3;
	public static int SUIT_SPADE = 4;

	public Card(int suit, int number){
		this.suit = suit;
		this.number = number;
	}
	
	//数字を見る
	public int showNumber(){
		return this.number;	
	}
}