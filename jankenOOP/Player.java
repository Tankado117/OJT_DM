public class Player{
  //���O�̃C���X�^���X�ϐ�
  String name;
  //�������|�C���g���o���Ă������߂̃C���X�^���X�ϐ�
  int point = 0;
  //��̏o���������߂郁�\�b�h
  public Player(String name){
    this.name = name;
  }
  public String showHand(){
   double r = Math.random() * 3;

   String j =  doJanken(r);

  return j;
  }
 //�����_���̐����ɏo���������蓖�Ă郁�\�b�h
  public String doJanken(double r){
    if (0<= r && r < 1){
      return  "�O�[";
    }else if(1<= r && r < 2){
      return  "�`���L";
    }else{
      return  "�p�[";
    }
  }
  //�������񐔂��o���郁�\�b�h
  public void addPoint(){
    point++;
  }
  //�������񐔂𓚂���
  public int Answer(){
    return point;
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
