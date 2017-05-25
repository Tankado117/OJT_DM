public class Judge{
  String name;
  //�W�����P�����J�n���郁�\�b�h
  public void startJanken(Player player1, Player player2){
    //�W�����P���J�n�錾
    System.out.println("�u�W�����P���J�n�v");
    //�v���C���[�̖��O
    String player1Name = player1.name;
    String player2Name = player2.name;

    for(int count = 1; count <=3; count++){
      //�v���C���[���W�����P���ŏo��������
      String p1Hand = player1.showHand();
      String p2Hand = player2.showHand();
      //���̃W�����P���𔻒��A�|�C���g�����Z
      int getPoint = judgeBattle(p1Hand,p2Hand,player1Name,player2Name);
      if(getPoint == 1){
        player1.addPoint();
      }else if(getPoint == 2){
        player2.addPoint();
      }else{
      }
    }
    int p1Point = player1.Answer();
    int p2Point = player2.Answer();
    
    judgeGame(p1Point, p2Point);
  }
  //���̃W�����P���𔻒肷�郁�\�b�h
  public int judgeBattle(String hand1 ,String hand2,String player1Name,String player2Name){
    System.out.println(hand1 +"VS"+ hand2);

    if( hand1 == "�O�[" && hand2 == "�`���L"){
        System.out.println( player1Name +"�������܂���");
        return 1;
      }else if( hand1 == "�`���L" && hand2 == "�p�["){
        System.out.println(player1Name+"�������܂���");
        return 1;
      }else if( hand1 == "�p�[" && hand2 == "�O�["){
        System.out.println(player1Name+"�������܂���");
        return 1;
      }else if( hand1 == hand2){
        System.out.println(player1Name+"���������܂���");
        return 0;
      }else{
        System.out.println(player2Name+"�������܂���");
        return 2;
      }
  }
  //�ŏI�I�ȏ����𔻒肷�郁�\�b�h
  public void judgeGame(int p1point, int p2point){
    if ( p1point > p2point ) {
      System.out.println(p1point + "��" + p2point + "�ł̏����ł�");
    }else if ( p1point == p2point ) {
      System.out.println( p1point + "��" + p2point + "�ň��������ł�");
    }else{
      System.out.println( p1point + "��" + p2point + "�ł̏����ł�");
    }
  }
}
/*�ē��F�u�킩��܂����B�W�����P��3�񏟕����͂��߂܂��I�v

�ē��F�u�܂�1���B�W�����P���A�|���I�v
���c�F�u�p�[�I�v
�R�c�F�u�`���L�I�v
�ē��F�u�͂��A�R�c����̏����ł��v

�ē��F�u����2���B�W�����P���A�|���I�v
				�E
				�E
�ē��F�u3�񏟕����I���܂����B�������񐔂𕷂��܂��v
�ē��F�u���c����͉��񏟂��܂������H�v
���c�F�u1��ł��v
�ē��F�u�R�c����͉��񏟂��܂������H�v
�R�c�F�u2��ł��v

�ē��F�u2��1�ŁA�R�c����̏����ł��I�v*/
