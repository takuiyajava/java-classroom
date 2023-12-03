package assignment_02.chara;

public class Genos extends Character {

    // Constructor
    public Genos() {
        super("ジェノス（鬼サイボーグ)");
    }

    // Override superclass method
    @Override
    public String message() {

        int randomNum = (int) (Math.random() * 2);
        String message = "";
        switch(randomNum) {
            case 0 -> message = ": \"質問に答えるかこのまま消滅するか選べ\"";
            case 1 -> message = ": \"そのまま動くな\"";
            default -> message = ": \"クセーノ博士の言う通りだった\"";
        }

        return message;
    }

}
