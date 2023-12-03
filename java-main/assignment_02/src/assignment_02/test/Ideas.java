package assignment_02.test;

import assignment_02.chara.Genos;
import assignment_02.chara.Saitama;

public class Ideas {

    // Select attack
//    String skillOne = selectedCharacter == 1 ? characterOne.attack(0) : characterTwo.attack(0);
//    String skillTwo = selectedCharacter == 1 ? characterOne.attack(1) : characterTwo.attack(1);



    // Generate instance by method
    public static String generateHero(int selectedCharacter) {

        String character = "";
        Saitama characterOne = new Saitama();
        Genos characterTwo = new Genos();
        switch (selectedCharacter) {
            case 1 -> character = characterOne.name;
            case 2 -> character = characterTwo.name;
        }
        return character;
    }

//    @Override
//    public String attack(int selectedCharacter) {
//        super.attack(selectedCharacter);
//        String attack = "";
//        switch(selectedCharacter) {
//            case 0 -> attack = "マシンガンブロー ";
//            case 1 -> attack = "焼却砲";
//        }
//
//        return attack;
//    }
}


