package assignment_02.util;

public class Messages {

    public static String clearMessage(int msgNum) {
        String[] clearMessageList = {
                "クリア",
                "おめでとうございます！!"
        };

        return clearMessageList[msgNum];
    }


    public static String errorMessage(int msgNum) {
        String[] errorMessage = {
                "選択可能キャラクターがいませんでした。"
        };

        return errorMessage[msgNum];
    }

}
