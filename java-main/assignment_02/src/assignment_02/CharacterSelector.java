package assignment_02;

import java.util.Scanner;

public class CharacterSelector {

    public static String characterSelector(String character1, String character2, int selectedCharacter, String playCharacter) {
        boolean isSelected;

        do {
            System.out.println(GameText.displayGameText(1));

            // Select character
            System.out.printf("[1] %s  [2] %s %n", character1, character2);

            // Input
            selectedCharacter = new Scanner(System.in).nextInt();

            switch (selectedCharacter) {
                case 1 -> {
                    playCharacter = character1;
                    isSelected = true;
                }
                case 2 -> {
                    playCharacter = character2;
                    isSelected = true;
                }
                default -> {
                    System.out.println(Messages.errorMessage(0));
                    isSelected = false;
                }
            }
        } while (!isSelected);

        return playCharacter;
    }
}
