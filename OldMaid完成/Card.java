public class Card
{
	//�J�[�h�̐����A�X�[�g���i�[
	public int number;
	public int suit;

	//�J�[�h�����̂��߂̕ϐ�
	public static int JOKER = 0;
	public static int SUIT_CLUB = 1;
	public static int SUIT_DIAMOND = 2;
	public static int SUIT_HEART = 3;
	public static int SUIT_SPADE = 4;

	public Card(int suit, int number){
		this.suit = suit;
		this.number = number;
	}
	
	//����������
	public int showNumber(){
		return this.number;	
	}


	public String ShowSuit(){
		if (suit == 0) {
			return 	"JK";
		}else if (suit == 1) {
			return	"C";
		}else if (suit == 2) {
			return  "D";
		}else if (suit == 3) {
			return	"H";
		}else{
			return	"S";
		}
	}


}