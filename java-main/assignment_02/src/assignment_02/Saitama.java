package assignment_02;

public class Saitama extends Character {

    // Constructor
    public Saitama() {
        super("サイタマ（ハゲマント)");
    }


    // Override superclass method
    @Override
    public String message(int selectedCharacter) {
        super.message(selectedCharacter);
        String message = "";
        switch(selectedCharacter) {
            case 1 -> message = ": \"趣味でヒーローをやっている者だ\"";
            case 2 -> message = ": \"お前の怪人は妥協の趣味\"";
        }
//		System.out.println(message);
        return message;
    }

    @Override
    public String attackVoice(int selectedCharacter) {
        super.attackVoice(selectedCharacter);
        String attackVoice = "";
        switch(selectedCharacter) {
            case 1 -> attackVoice = ": !　はっ";
            case 2 -> attackVoice = ": !　はぁぁぁぁ";
        }

        return attackVoice;
    }
}
