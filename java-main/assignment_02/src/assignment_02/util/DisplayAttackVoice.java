package assignment_02.util;

public class DisplayAttackVoice {
    public static void displayAttackVoice(String playCharacter, String[] skillList, int selectedAttack, String[] characterAttackVoice) {
        System.out.printf("%s: %s %s %n", playCharacter, skillList[selectedAttack], characterAttackVoice[0]);
    }
}


