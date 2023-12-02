package assignment_02;

public class Villain {

    // Fields
    String name;


    // Constructor
    public Villain(String name) {
        this.name = name;
    }

    // Display message depending on number of stage
    public static String message(int stageProgress) {
        String message = "";
        switch (stageProgress) {
            case 1 -> message = ": \"動くな\"";
            case 2 -> message = ": \"私は人間どもが環境汚染を繰り返すことによって生まれたワクチンマンだ\"";
            case 3 -> message = ": \"悪を執行する\"";
        }
//		System.out.println(message);
        return message;
    }

    // Random Attack
    public static String attackVoice(int stageProgress) {
        String attackVoice = "";
        switch (stageProgress) {
            case 1 -> attackVoice = ": \"ふん\"";
            case 2 -> attackVoice = ": \"だぁぁぁ\"";
            case 3 -> attackVoice = ": \"はぁぁぁ\"";
        }
//		System.out.println(attackVoice);
        return attackVoice;
    }

}
