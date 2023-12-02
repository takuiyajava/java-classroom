package assignment_02;

public class Test3 {

	public static void main(String[] args) {
		Character c = new Character("a");

		
		
		int stages = 3;
		boolean isGameOver = false;
		int stageProgress = 1;
		for (int i = 0; i < stages; i++) {
			
			// Check isGameOver and clear stage
			if (!isGameOver) {
				// Clear message for each stage
				System.out.println("clear");					
				if (stageProgress == stages) {
					// Stage all clear
					System.out.println("all clear");
				}
				stageProgress++;
			}
		}
	}
}
