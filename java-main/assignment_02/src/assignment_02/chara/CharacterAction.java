package assignment_02.chara;

public class CharacterAction {

    public static boolean switcher(int selectedCharacter,int selectedAttack,String playCharacter,String[] skillList,String characterAttackVoice, boolean isSuccess) {
        // Switch character actions
        switch (selectedCharacter) {
            // Character one voice
            case 1 -> {
                // Check selectedAttack
                isSuccess = CharacterAttack.onePunch(selectedAttack, playCharacter, skillList, characterAttackVoice, isSuccess);
            }
            case 2 -> {
                // Character 2 random attack condition
                isSuccess = CharacterAttack.randomAttack(selectedAttack, playCharacter, skillList, characterAttackVoice, isSuccess);
            }
        }
        return isSuccess;
    }

}
