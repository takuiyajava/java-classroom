package assignment_02.chara;

public class Saitama extends Character {

    // Constructor
    public Saitama() {
        super("サイタマ（ハゲマント)");
    }


    // Override superclass method
    @Override
    public String message() {

        int randomNum = (int) (Math.random() * 2);
        String message = "";
        switch(randomNum) {
            case 0 -> message = ": \"趣味でヒーローをやっている者だ\"";
            case 1 -> message = ": \"お前の怪人は妥協の趣味\"";
            default -> message = ": \"俺のヒーローは本気の趣味だ\"";
        }

        return message;
    }

}
