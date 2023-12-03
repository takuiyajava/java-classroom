package assignment_02.villain;

public class Villain {

    // Fields
    String name;


    // Constructor
    public Villain() {}

    public String stageVillain(int stageProgress) {
        String name = "";

        switch (stageProgress) {
            case 1 -> name = "ハンマーヘッド";
            case 2 -> name = "ワクチンマン";
            case 3 -> name = "ガロウ";
        }
        ;

        return name;
    }

    // Display message depending on number of stage
    public static String message(int stageProgress) {
        String message = "";
        switch (stageProgress) {
            case 1 -> message = "\"動くな\"";
            case 2 -> message = "\"私は人間どもが環境汚染を繰り返すことによって生まれたワクチンマンだ\"";
            case 3 -> message = "\"悪を執行する\"";
        }

        return message;
    }

    // Could be Random Attack
    public static String attackVoice(int stageProgress) {
        String attackVoice = "";
        switch (stageProgress) {
            case 1 -> attackVoice = "\"ふん\"";
            case 2 -> attackVoice = "\"だぁぁぁ\"";
            case 3 -> attackVoice = "\"はぁぁぁ\"";
        }

        return attackVoice;
    }

}
