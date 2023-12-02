package assignment_02;

public class GameText {

    public static String displayGameText(int number) {
        String[] gameTextList = {
                "ようこそゲームを開始します。",
                "キャラクターを選択してください。",
                "ステージ",
                "攻撃を選択: ",
                "の攻撃は失敗した",
                "GAME OVER"
        };

        return gameTextList[number];
    }
}
