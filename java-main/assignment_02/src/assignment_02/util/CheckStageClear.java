package assignment_02.util;

public class CheckStageClear {

    public static int clearMessage(boolean isGameOver, int i, int stageProgress, int stages) {

        // Check isGameOver and clear stage
        if (!isGameOver) {
            // Clear message for each stage
            System.out.printf("%s%d %s %n", GameText.displayGameText(2), i + 1, Messages.clearMessage(0));
            if (stageProgress == stages) {
                // Stage all clear message
                System.out.printf("全%s %s %s %n", GameText.displayGameText(2), Messages.clearMessage(0), Messages.clearMessage(1));
            }
            stageProgress++;
        }
        return stageProgress;
    }
}
