public class Player
{
    String name;
    Hand hand = new.Hand();

    //�J�[�h��z��
    public void distributeCard(Card card){
        hand.addCard(card);
        hand.searchCard();
    }

    //���Ԃ��w������
    public void nominate(){

    }

    //��D���o��
    public void putHand(){

    }
}