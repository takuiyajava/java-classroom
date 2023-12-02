package assignment_02;

public class Character {
	
	// Fields attribute
	String name;
	
	// Constructors
	public Character() {}
	
	public Character(String name) {
		this.name = name;
	}
	
	// Methods
	// Random message
	public String message(int selectedCharacter) {
		String message = "";
		switch(selectedCharacter) {
			case 0 -> message = ": \"趣味でヒーローをやっている者だ\"";
			case 1 -> message = ": \"そのまま動くな\"";
		}
//		System.out.println(message);
		return message;
	}
	
	// Random Attack voice
	public String attackVoice(int selectedCharacter) {
		String attackVoice = "";
		switch(selectedCharacter) {
			case 1 -> attackVoice = ": !　はっ";
			case 2 -> attackVoice = ": !　はぁぁぁぁ";
		}

		return attackVoice;
	}
	
	// Attack
	public String attack(int selectedCharacter) {
		String attack = "";
		switch(selectedCharacter) {
			case 0 -> attack = "普通のパンチ";
			case 1 -> attack = "パンチ";
		}

		return attack;
	}

}
