package assignment_02;

public class Generator {

    public static int randomNumber(int range) {

        int randomRange = 0;
        randomRange = (int) (Math.random() * range);

        return randomRange;
    }
}
