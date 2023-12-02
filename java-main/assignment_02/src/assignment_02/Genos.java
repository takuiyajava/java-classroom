package assignment_02;

public class Genos extends Character {

    // Constructor
    public Genos() {
        super("ジェノス（鬼サイボーグ)");
    }

    // Override superclass method
    @Override
    public String message(int selectedCharacter) {
        super.message(selectedCharacter);
        String message = "";
        switch(selectedCharacter) {
            case 1 -> message = ": \"質問に答えるかこのまま消滅するか選べ\"";
            case 2 -> message = ": \"そのまま動くな\"";
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
