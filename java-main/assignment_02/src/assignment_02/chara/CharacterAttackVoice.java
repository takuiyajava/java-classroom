package assignment_02.chara;

public class CharacterAttackVoice {

    /**
     * This method switch characters and randomly return the voice
     * @param selectedCharacter
     * @return
     */
    public static String switcher(int selectedCharacter) {
        String attackVoice = "";
        int randomNum = (int) (Math.random() * 2);
        // Switch character
        switch (selectedCharacter) {
            case 1 -> {
                // switch voices
                switch (randomNum) {
                    case 0 -> attackVoice = "! .......";
                    case 1 -> attackVoice = "!　頭さわんなよ";
                }
            }
            case 2 -> {
                // switch voices
                switch (randomNum) {
                    case 0 -> attackVoice = "!　はっ";
                    case 1 -> attackVoice = "!　はぁぁぁぁ";
                }
            }
        }
        return attackVoice;
    }
}