package assignment_02;

public class Skill {
    public static String skillSwitcher(int selectedCharacter, int skillNum) {

        String attack = "";
        switch(selectedCharacter) {
            case 1 -> {
                switch(skillNum) {
                    case 0 -> attack = "普通のパンチ";
                    case 1 -> attack = "パンチ";
                }
            }
            case 2 -> {
                switch(skillNum) {
                    case 0 -> attack = "マシンガンブロー ";
                    case 1 -> attack = "焼却砲";
                }
            }
        }

        return attack;
    }

}
