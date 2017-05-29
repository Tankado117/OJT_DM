import java.util.ArrayList;
import java.util.List;

public class Master{

	public List<Player> nameList = new ArrayList<Player>();

	//参加プレイヤーを登録するメソッド
	public void registerPlayer(Player player){
		nameList.add(player);
	}

	//ゲームの準備をする
	public void prepareGame(Hand trump){
		System.out.println("【カードを配ります】");

		//トランプをシャッフルする
		trump.shuffleCard();

		//修正箇所⑦
		//↓致命的なバグ
		//for(int i = 0; i < trump.cardList.size(); i++){

		//カードを配る
		int mCount = trump.cardList.size();
		for(int i = 0; i < mCount; i++){
			Card card = trump.drawCard();
			nameList.get(i % nameList.size()).distributeCard(card);
		}
	}

	//ゲームを開始する
//	public void startGame(){
//		int flg = 0;
//		int participant = nameList.size();//参加者人数
//		Player player;
//		Player nextplayer;//隣のプレイヤーの情報を格納する変数
//		//プレイヤーと隣のプレイヤーを３人でローテーションする
//		while(participant != 1){
//			if(flg == 0){
//				player = nameList.get(flg);
//				nextplayer = nameList.get(flg+1);
//				flg = flg + 1;
//			}
//			else if(flg == 1){
//				player = nameList.get(flg);
//				nextplayer = nameList.get(flg+1);
//				flg = flg + 1;
//			}else if(flg == 2){
//				player = nameList.get(flg);
//				nextplayer = nameList.get(0);
//				flg = flg + 1;
//			}else{
//				flg = 0;
//				player = nameList.get(flg);
//				nextplayer = nameList.get(flg+1);
//				flg = flg + 1;
//			}
//			//プレイヤーを指名する
//			player.nominate(player, nextplayer, nameList);
//		}
//	}

	//修正箇所④
	//参加人数は減っていくため上記のロジックでは不十分

	//ゲームを開始する
	public void startGame(){
		System.out.println("\n【ババ抜きを開始します。】\n");

		Player player;
		Player nextplayer;//隣のプレイヤーの情報を格納する変数
		//プレイヤーと隣のプレイヤーを３人でローテーションする

		int i=0;
		while(nameList.size() > 1){
			player = nameList.get(i % nameList.size());
			nextplayer = nameList.get((i+1) % nameList.size());
			//プレイヤーを指名する
			player.nominate(player, nextplayer);
			i++;
		}

		System.out.println(nameList.get(0).name + "の負けです！");
		System.out.println("【ババ抜きを終了します。】");
	}

	//ゲームを終了する
	public void endGame(Player player){
		System.out.println( player.name +"さんが上がりました");
		int endPlayer = nameList.indexOf(player);
		nameList.remove(endPlayer);
	}
}