package assignment_02.test;

import assignment_02.chara.CharacterAction;
import assignment_02.chara.Saitama;
import assignment_02.chara.CharacterAttackVoice;
import assignment_02.util.ClearStageChecker;
import assignment_02.chara.Genos;
import assignment_02.util.*;
import assignment_02.villain.Villain;
import assignment_02.villain.VillainAttack;

import java.util.Scanner;


// Prototype
public class Test02 {
    public static void main(String[] args) {

        // Character Instances
        Saitama characterOne = new Saitama();
        Genos characterTwo = new Genos();
        // Character
        String character1 = characterOne.name;
        String character2 = characterTwo.name;
        String playCharacter = "";

        // Villain Instances
        Villain villain = new Villain();
        // stageVillain is passed method
        String stageVillain;

        boolean isGameOver = false;
        int selectedCharacter;


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

            selectedCharacter = new Scanner(System.in).nextInt();

            // Select character by selectedCharacter
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
        int stages = 3;
        for (int i = 0; i < stages; i++) {
            // Start stage: display stage
            System.out.printf("%s %d %n", GameText.displayGameText(2), i + 1);

            // Switch villain per stage
            int stageProgress = i + 1;

            stageVillain = villain.stageVillain(stageProgress);

            // Display Comments
            String[] characterComment = {
                    characterOne.message(),
                    characterTwo.message(),
            };

            // Switch character comments
            switch (selectedCharacter) {
                // characterOne message
                case 1 -> System.out.printf("%s %s %n", playCharacter, characterComment[0]);
                // characterTwo message
                case 2 -> System.out.printf("%s %s %n", playCharacter, characterComment[1]);
            }

            // Switch villain messages per stage
            String villainComment = villain.message(stageProgress);

            // Display villainComment
            System.out.printf("%s: \"%s\" %n", stageVillain, villainComment);

            // Attack function ==================================
            // Passing selectedCharacter and skill number
            String[] skillList = {
                    Skill.skillSwitcher(selectedCharacter, 0),
                    Skill.skillSwitcher(selectedCharacter, 1),
            };

            // Display skillList for selecting attack
            System.out.printf("%s: [0]%s  [1]%s %n", GameText.displayGameText(3), skillList[0], skillList[1]);

            // Input skill list
            int selectedAttack = new Scanner(System.in).nextInt();
            // Store attack voice
            String characterAttackVoice = CharacterAttackVoice.switcher(selectedCharacter);
            // isSuccess is used for randomSound or villainAttack
            boolean isSuccess = false;

            // Switch character actions
            isSuccess = CharacterAction.switcher(selectedCharacter, selectedAttack, playCharacter, skillList, characterAttackVoice, isSuccess);
            // Attack End ==================================

            // Call attackVoice() method store into villainAttackVoice
            String villainAttackVoice = villain.attackVoice(stageProgress);

            // Random sounds and VillainAttack ====================================
            if (isSuccess) {
                // Call randomSound() to display random sound
                System.out.printf("\"%s\" %n", Effect.randomSound(3));
            }
            // Villain attack turn
            else if (!isSuccess && selectedCharacter == 1) {
                // Miss
                VillainAttack.missPattern(stageVillain, villainAttackVoice);
            } else {
                // GAME OVER
                VillainAttack.gameOverPattern(stageVillain, villainAttackVoice, isGameOver);
                break;
            }
            // Random sounds and VillainAttack End ====================================

            // Clear message
            ClearStageChecker.clearMessage(isGameOver, i, stageProgress, stages);
        }
        // Loop End ==============================
        // End game
    }
}
