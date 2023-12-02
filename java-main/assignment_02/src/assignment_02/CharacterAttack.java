package assignment_02;

public class CharacterAttack {

    public static void characterOne() {
        // Check selectedAttack
        switch (selectedAttack) {
            // Character Attack
            case 0 -> {
                System.out.printf("%s: %s %s %n", playCharacter, skillList[0], characterAttackVoice[0]);
                isSuccess = true;
            }
            case 1 -> {
                System.out.printf("%s: %s %s %n", playCharacter, skillList[1], characterAttackVoice[0]);
                isSuccess = true;
            }
            default -> {
                System.out.printf("%s %s %n", playCharacter, GameText.displayGameText(4));
            }
        }
        ;
    }

    public static void characterTwo() {
        // Character 2 random attack condition
        switch (selectedAttack) {
            // Character Attack
            case 0 -> {
                randomSuccessAttack = (int) (Math.random() * 2);
                if (randomSuccessAttack == 1) {
                    // Success
                    System.out.printf("%s: %s %s %n", playCharacter, skillList[0], characterAttackVoice[0]);
                    isSuccess = true;
                } else {
                    System.out.printf("%s: %s %s %n", playCharacter, skillList[0], characterAttackVoice[0]);
                }
            }
            case 1 -> {
                randomSuccessAttack = (int) (Math.random() * 2);
                if (randomSuccessAttack == 1) {
                    // Success
                    System.out.printf("%s: %s %s %n", playCharacter, skillList[1], characterAttackVoice[0]);
                    isSuccess = true;
                } else {
                    System.out.printf("%s: %s %s %n", playCharacter, skillList[1], characterAttackVoice[0]);
                    System.out.printf("%s %s %n", playCharacter, GameText.displayGameText(4));
                }
            }
            default -> {
                System.out.printf("%s %s %n", playCharacter, GameText.displayGameText(4));
            }
        }
        ;
    }
}
