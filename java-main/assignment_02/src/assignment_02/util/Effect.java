package assignment_02.util;

public class Effect {
    public static String randomSound(int randomRange) {
        String[] effectSoundList = {
                "ドォォン",
                "ズドォォン",
                "バスコム",
        };

        int randomEffectSound = (int) (Math.random() * randomRange);

        return effectSoundList[randomEffectSound];
    }

}
