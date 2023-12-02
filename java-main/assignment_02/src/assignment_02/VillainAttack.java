package assignment_02;

/**
 * ジェノス（鬼サイボーグ) の攻撃は失敗した
 * ハンマーヘッド: : "ふん"
 * GAME OVER
 */
public class VillainAttack {
    public static void missPattern(String stageVillain, String villainAttackVoice) {

        // Villain attack voice
        System.out.printf("%s: %s %n", stageVillain, villainAttackVoice);

        // Miss attack message
        System.out.printf("%s %s %n", stageVillain, GameText.displayGameText(4));
    }

    public static void gameOverPattern(String stageVillain, String villainAttackVoice, boolean isGameOver) {

        // Villain attack voice
        System.out.printf("%s: %s %n", stageVillain, villainAttackVoice);

        // Game Over
        System.out.println(GameText.displayGameText(5));
        isGameOver = true;
    }
}
