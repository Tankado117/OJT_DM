import java.util.ArrayList;
import java.util.List;

public class Master{

	public List<Player> nameList = new ArrayList<Player>();

	//�Q���v���C���[��o�^���郁�\�b�h
	public void registerPlayer(Player player){
		nameList.add(player);
	}

	//�Q�[���̏���������
	public void prepareGame(Hand trump){
		System.out.println("�y�J�[�h��z��܂��z");

		//�g�����v���V���b�t������
		trump.shuffleCard();

		//�C���ӏ��F
		//���v���I�ȃo�O
		//for(int i = 0; i < trump.cardList.size(); i++){

		//�J�[�h��z��
		int mCount = trump.cardList.size();
		for(int i = 0; i < mCount; i++){
			Card card = trump.drawCard();
			nameList.get(i % nameList.size()).distributeCard(card);
		}
	}

	//�Q�[�����J�n����
//	public void startGame(){
//		int flg = 0;
//		int participant = nameList.size();//�Q���Ґl��
//		Player player;
//		Player nextplayer;//�ׂ̃v���C���[�̏����i�[����ϐ�
//		//�v���C���[�Ɨׂ̃v���C���[���R�l�Ń��[�e�[�V��������
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
//			//�v���C���[���w������
//			player.nominate(player, nextplayer, nameList);
//		}
//	}

	//�C���ӏ��C
	//�Q���l���͌����Ă������ߏ�L�̃��W�b�N�ł͕s�\��

	//�Q�[�����J�n����
	public void startGame(){
		System.out.println("\n�y�o�o�������J�n���܂��B�z\n");

		Player player;
		Player nextplayer;//�ׂ̃v���C���[�̏����i�[����ϐ�
		//�v���C���[�Ɨׂ̃v���C���[���R�l�Ń��[�e�[�V��������

		int i=0;
		while(nameList.size() > 1){
			player = nameList.get(i % nameList.size());
			nextplayer = nameList.get((i+1) % nameList.size());
			//�v���C���[���w������
			player.nominate(player, nextplayer);
			i++;
		}

		System.out.println(nameList.get(0).name + "�̕����ł��I");
		System.out.println("�y�o�o�������I�����܂��B�z");
	}

	//�Q�[�����I������
	public void endGame(Player player){
		System.out.println( player.name +"���񂪏オ��܂���");
		int endPlayer = nameList.indexOf(player);
		nameList.remove(endPlayer);
	}
}