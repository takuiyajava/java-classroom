package assignment_02;

public class Test {
	
	public static void main(String[] args) {
		boolean isSuccess = false;
		int selectedCharacter = 1;
		
		int randomSuccessAttack = (int) (Math.random() * 2);
		if (randomSuccessAttack == 1) {
			// Success
			System.out.println("attack");
			isSuccess = true;
		} else {
			System.out.println("misss");
			isSuccess = false;
		}
		
		
		String[] effectSounds = {
				"ドォォン",
				"ズドォォン",
				"バスコム",
		};
	
		// Random sounds
		if(isSuccess) {
			int range = 3;
			int randomEffectSound = (int) (Math.random() * range) ;
			// Effect Sound
			System.out.printf("\"%s\" %n", effectSounds[randomEffectSound]);			
		} else {
			// Villain attack
			System.out.println("viilian attack");			
		}
		

		
//		// Villain random attack
//		if(!isSuccess && selectedCharacter == 1) {
//			// Villain attack
//			System.out.println("misss");
//		} else {
//			// Villain attack
//			System.out.println("attack");
//			System.out.println("GAME OVER");
//		}


	}

}
