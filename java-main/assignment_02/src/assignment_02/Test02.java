package assignment_02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // Instances
        // Character
        Saitama characterOne = new Saitama();
        Genos characterTwo = new Genos();

        // Villain
        Villain villainOne = new Villain("ハンマーヘッド");
        Villain villainTwo = new Villain("ワクチンマン");
        Villain villainThree = new Villain("ガロウ");

        // Create variables
        // Character
        String character1 = characterOne.name;
        String character2 = characterTwo.name;

        // Villain
        String villain1 = villainOne.name;
        String villain2 = villainTwo.name;
        String villain3 = villainThree.name;
        String stageVillain = "";

        int stages = 3;

        boolean isGameOver = false;
        int selectedCharacter = 0;
        String playCharacter = "";

        // Start Application program =======================================

        // First Messages
        System.out.println(GameText.displayGameText(0));

        // Character Select =============================
        // Loop out when character is selected
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

        // Character Select End =============================


        // Loop start =====================================

        for (int i = 0; i < stages; i++) {
            // Start stage: display stage
            System.out.printf("%s %d %n", GameText.displayGameText(2), i + 1);

            // Switch villain per stage
            int stageProgress = i + 1;
            switch (stageProgress) {
                case 1 -> stageVillain = villain1;
                case 2 -> stageVillain = villain2;
                case 3 -> stageVillain = villain3;
            }


            // Display Comments
            int randomMessage = Generator.randomNumber(2);
            String[] characterComment = {
                    characterOne.message(selectedCharacter),
                    characterTwo.message(selectedCharacter),
            };

            // Switch character comments
            switch (selectedCharacter) {
                case 1 -> System.out.printf("%s %s %n", playCharacter, characterComment[0]);
                case 2 -> System.out.printf("%s %s %n", playCharacter, characterComment[1]);
            }

            // Switch villain comments
            String[] villainComment = {
                    villainOne.message(stageProgress),
                    villainTwo.message(stageProgress),
                    villainThree.message(stageProgress),
            };

            System.out.printf("%s: \"%s\" %n", stageVillain, villainComment[0]);


            // Attack function ==================================
            // Select attack


            // Passing selected character and skill number
            String[] skillList = {
                    Skill.skillSwitcher(selectedCharacter, 0),
                    Skill.skillSwitcher(selectedCharacter, 1),
            };

            System.out.printf("%s: [0]%s  [1]%s %n", GameText.displayGameText(3), skillList[0], skillList[1]);

            // Input
            int selectedAttack = new Scanner(System.in).nextInt();
            int randomSuccessAttack = 0;

            String[] characterAttackVoice = {
                    characterOne.attackVoice(selectedCharacter),
                    characterTwo.attackVoice(selectedCharacter),
            };

            // Switch character actions
            boolean isSuccess = false;
            switch (selectedCharacter) {
                case 1 -> {
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
                case 2 -> {
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
            // Attack function End ==================================


            // Random sounds ====================================

            // Todo: villainOne should be villain general use
            String villainAttackVoice = villainOne.attackVoice(stageProgress);

            if (isSuccess) {
                // Effect sound
                System.out.printf("\"%s\" %n", Effect.randomSound(3));
            }
            // Villain attack turn
            else if (!isSuccess && selectedCharacter == 1) {
                VillainAttack.missPattern(stageVillain, villainAttackVoice);
            } else {
                VillainAttack.gameOverPattern(stageVillain, villainAttackVoice, isGameOver);
                break;
            }


            CheckStageClear.clearMessage(isGameOver, i, stageProgress, stages);
        }
        // Loop End ==============================
        // End game
    }
}
