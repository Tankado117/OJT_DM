public class ObjectJanken
{
    public static void main(String[] args)
    {
        // �R���i�֓�����j�̃C���X�^���X����
        Judge saito = new Judge();

        // �v���C���[�P�i���c����j�̐���
        Player murata = new Player("���c����");

        // �v���C���[�Q�i�R�c����j�̐���
        Player yamada = new Player("�R�c����");

        // ���c����ƎR�c������v���C���[�Ƃ��ăW�����P�����J�n����
        saito.startJanken(murata, yamada);
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
