public class Player
{
    String name;
    Hand hand = new.Hand();

    //カードを配る
    public void distributeCard(Card card){
        hand.addCard(card);
        hand.searchCard(card);
    }

    //順番を指名する
    public void nominate(){

    }

    //手札を出す
    public void putHand(){

    }
}