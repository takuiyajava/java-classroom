//package assignment_02;
//import java.util.Scanner;
// Fisrt idea
//public class Test3 {
//
//	public static void main(String[] args) {
//			// Instances
//			// Character
//			Character heroOne = new Character("サイタマ（ハゲマント）");
//			Character heroTwo = new Character("ジェノス（鬼サイボーグ）");
//
//			// Villain
//			Villain villainOne = new Villain("ハンマーヘッド");
//			Villain villainTwo = new Villain("ワクチンマン");
//			Villain villainThree = new Villain("ガロウ");
//
//			// Create variables
//			// Character
//			String character1 = heroOne.name;
//			String character2 = heroTwo.name;
//
//			// Villain
//			String villian1 = villainOne.name;
//			String villian2 = villainTwo.name;
//			String villian3 = villainThree.name;
//			String stageVillian = "";
//
//			String[] gameText = {
//					"ようこそゲームを開始します。",
//					"キャラクターを選択してください。",
//					"ステージ",
//					"攻撃を選択: ",
//					"の攻撃は失敗した",
//					"GAME OVER"
//			};
//
//			String[] effectSounds = {
//					"ドォォン",
//					"ズドォォン",
//					"バスコム",
//			};
//
//			String[] clearMessage = {
//					"クリア",
//					"おめでとうございます！!"
//			};
//
//			String[] errorMessage = {
//					"選択可能キャラクターがいませんでした。"
//			};
//
//			int stages = 3;
//
//			boolean isSelected = false;
//			boolean isGameOver = false;
//			int selectedCharacter = 0;
//			String playCharacter = "";
//
//			// Start Application program =======================================
//
//			// First Messages
//			System.out.println(gameText[0]);
//
//
//			// Character Select =============================
//			do {
//				System.out.println(gameText[1]);
//
//				// Select character
//				System.out.printf("[1] %s  [2] %s %n", character1, character2);
//
//				// Input
//				selectedCharacter = new Scanner(System.in).nextInt();
//
//				switch(selectedCharacter) {
//					case 1 -> {
//						playCharacter = character1;
//						isSelected = true;
//					}
//					case 2 -> {
//						playCharacter = character2;
//						isSelected = true;
//					}
//					default -> {
//						System.out.println(errorMessage[0]);
//						isSelected = false;
//					}
//				}
//			} while (!isSelected);
//
//			// Character Select End =============================
//
//
//			// Loop start =====================================
//
//			for(int i = 0; i < stages; i++) {
//				// Start stage: display stage
//				System.out.printf("%s %d %n", gameText[2], i + 1);
//
//				// Switch villain per stage
//				int stageProgress = i + 1;
//				switch (stageProgress) {
//					case 1 -> stageVillian = villian1;
//					case 2 -> stageVillian = villian2;
//					case 3 -> stageVillian = villian3;
//				}
//
//
//				// Display Comments
//				int randomMessage = Generator.randomNumber(2);
//				String[] characterComment = {
//						characterOne.message(selectedCharacter, randomMessage),
//						characterTwo.message(selectedCharacter, randomMessage),
//				};
//
//				// Switch character comments
//				switch(selectedCharacter) {
//					case 1 -> System.out.printf("%s %s %n", playCharacter, characterComment[0]);
//					case 2 -> System.out.printf("%s %s %n", playCharacter, characterComment[1]);
//				}
//
//				// Switch villian comments
//				String[] villianComment = {
//						villainOne.message(stageProgress),
//						villainTwo.message(stageProgress),
//						villainThree.message(stageProgress),
//				};
//
//				System.out.printf("%s: \"%s\" %n", stageVillian, villianComment[0]);
//
//
//				// Attack function ==================================
//				// Select attack
//				String[] attackList = {
//						heroOne.attack(0),
//						heroTwo.attack(1),
//				};
//
//				System.out.printf("%s: [0]%s  [1]%s %n", gameText[3], attackList[0], attackList[1]);
//
//				// Input
//				int selectedAttack = new Scanner(System.in).nextInt();
//				boolean isSuccess = false;
//				int randomSuccessAttack = 0;
//
//				String[] characterAttackVoice = {
//						heroOne.attackVoice(selectedCharacter),
//						heroTwo.attackVoice(selectedCharacter),
//				};
//
//				// Switch character actions
//
//				switch(selectedCharacter) {
//					case 1 -> {
//						// Check selectedAttack
//						switch(selectedAttack) {
//							// Character Attack
//							case 0 -> {
//								System.out.printf("%s: %s %s %n", playCharacter, attackList[0], characterAttackVoice[0]);
//								isSuccess = true;
//							}
//							case 1 -> {
//								System.out.printf("%s: %s %s %n", playCharacter, attackList[1], characterAttackVoice[0]);
//								isSuccess = true;
//							}
//							default -> {
//								System.out.printf("%s %s %n", playCharacter, gameText[4]);
//								isSuccess = false;
//							}
//						};
//					}
//					case 2 -> {
//						// Character 2 random attack condition
//						switch(selectedAttack) {
//							// Character Attack
//							case 0 -> {
//								randomSuccessAttack = (int) (Math.random() * 2);
//								if (randomSuccessAttack == 1) {
//									// Success
//									System.out.printf("%s: %s %s %n", playCharacter, attackList[0], characterAttackVoice[0]);
//									isSuccess = true;
//								} else {
//									System.out.printf("%s: %s %s %n", playCharacter, attackList[0], characterAttackVoice[0]);
//									isSuccess = false;
//								}
//							}
//							case 1 -> {
//								randomSuccessAttack = (int) (Math.random() * 2);
//								if (randomSuccessAttack == 1) {
//									// Success
//									System.out.printf("%s: %s %s %n", playCharacter, attackList[1], characterAttackVoice[0]);
//									isSuccess = true;
//								} else {
//									System.out.printf("%s: %s %s %n", playCharacter, attackList[1], characterAttackVoice[0]);
//									System.out.printf("%s %s %n", playCharacter, gameText[4]);
//									isSuccess = false;
//								}
//							}
//							default -> {
//								System.out.printf("%s %s %n", playCharacter, gameText[4]);
//								isSuccess = false;
//							}
//						};
//					}
//				}
//				// Attack function End ==================================
//
//
//				// Random sounds ====================================
//				String[] villianAttackVoice = {
//						villainOne.attackVoice(stageProgress),
//						villainOne.attackVoice(stageProgress),
//						villainOne.attackVoice(stageProgress),
//				};
//				if(isSuccess) {
//					int range = 3;
//					int randomEffectSound = (int) (Math.random() * range) ;
//					// Effect Sound
//					System.out.printf("\"%s\" %n", effectSounds[randomEffectSound]);
//				}
//				// Villain attack condition
//				else if(!isSuccess && selectedCharacter == 1) {
//					// Villain attack
//					System.out.printf("%s: %s %n", stageVillian, villianAttackVoice[0]);
//					// Misss Attack
//					System.out.printf("%s %s %n", stageVillian, gameText[4]);
//				} else {
//					// Villain attack
//					System.out.printf("%s: %s %n", stageVillian, villianAttackVoice[0]);
//
//					// Game Over
//					System.out.println(gameText[5]);
//					isGameOver = true;
//					break;
//				}
//
//
//				// Check isGameOver and clear stage
//				if (!isGameOver) {
//					// Clear message for each stage
//					System.out.printf("%s%d %s %n", gameText[2], i + 1, clearMessage[0]);
//					if (stageProgress == stages) {
//						// Stage all clear
//						System.out.printf("全%s %s %s %n", gameText[2],  clearMessage[0], clearMessage[1]);
//					}
//					stageProgress++;
//				}
//			}
//			// Loop End ==============================
//			// End game
//	}
//
//}
