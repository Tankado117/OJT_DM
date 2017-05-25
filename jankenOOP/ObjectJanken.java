public class ObjectJanken
{
    public static void main(String[] args)
    {
        // 審判（斎藤さん）のインスタンス生成
        Judge saito = new Judge();

        // プレイヤー１（村田さん）の生成
        Player murata = new Player("村田さん");

        // プレイヤー２（山田さん）の生成
        Player yamada = new Player("山田さん");

        // 村田さんと山田さんをプレイヤーとしてジャンケンを開始する
        saito.startJanken(murata, yamada);
    }
}
/*斉藤：「わかりました。ジャンケン3回勝負をはじめます！」

斉藤：「まず1回戦。ジャンケン、ポン！」
村田：「パー！」
山田：「チョキ！」
斉藤：「はい、山田さんの勝ちです」

斉藤：「次に2回戦。ジャンケン、ポン！」
				・
				・
斉藤：「3回勝負が終わりました。勝った回数を聞きます」
斉藤：「村田さんは何回勝ちましたか？」
村田：「1回です」
斉藤：「山田さんは何回勝ちましたか？」
山田：「2回です」

斉藤：「2対1で、山田さんの勝ちです！」*/
