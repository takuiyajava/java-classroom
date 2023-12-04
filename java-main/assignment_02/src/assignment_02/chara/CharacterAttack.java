package assignment_02.chara;

import assignment_02.util.GameText;

public class CharacterAttack {

    public static boolean onePunch(int selectedAttack, String playCharacter, String[] skillList, String characterAttackVoice, boolean isSuccess) {
        // Check selectedAttack
        switch (selectedAttack) {
            // Character Attack
            case 0 -> {
                // skill 0
                displayAttackVoice(playCharacter, skillList, selectedAttack, characterAttackVoice);
                isSuccess = true;
            }
            case 1 -> {
                // skill 1
                displayAttackVoice(playCharacter, skillList, selectedAttack, characterAttackVoice);
                isSuccess = true;
            }
            default -> {
                // Miss
                System.out.printf("%s %s %n", playCharacter, GameText.displayGameText(4));
            }
        }
        ;
        return isSuccess;
    }


    // randomAttack() method return attack voice and miss message
    // Each case return setRandomAttack() and if no valid number will be input, execute default
    public static boolean randomAttack(int selectedAttack, String playCharacter, String[] skillList, String characterAttackVoice, boolean isSuccess) {
        switch (selectedAttack) {
            // Character Attack
            case 0 -> {
                // skill 0
                isSuccess = setRandomAttack(playCharacter, skillList, selectedAttack, characterAttackVoice, isSuccess);
            }
            case 1 -> {
                // skill 1
                isSuccess = setRandomAttack(playCharacter, skillList, selectedAttack, characterAttackVoice, isSuccess);
            }
            default -> {
                // Miss message
                System.out.printf("%s %s %n", playCharacter, GameText.displayGameText(4));
            }
        }
        ;
        return isSuccess;
    }

    // Check and Randomize attack result
    public static boolean setRandomAttack(String playCharacter, String[] skillList, int selectedAttack, String characterAttackVoice, boolean isSuccess) {
        int randomNum = (int) (Math.random() * 2);
        if (randomNum == 1) {
            // Success attack
            displayAttackVoice(playCharacter, skillList, selectedAttack, characterAttackVoice);
            isSuccess = true;
        } else {
            // Miss attack
            displayAttackVoice(playCharacter, skillList, selectedAttack, characterAttackVoice);
            System.out.printf("%s %s %n", playCharacter, GameText.displayGameText(4));
        }
        return isSuccess;
    }

    public static void displayAttackVoice(String playCharacter, String[] skillList, int selectedAttack, String characterAttackVoice) {
        System.out.printf("%s: %s%s %n", playCharacter, skillList[selectedAttack], characterAttackVoice);
    }
}
