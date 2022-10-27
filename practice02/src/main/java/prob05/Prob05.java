//package prob05;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Prob05 {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		while (true) {
//			// 정답 램덤하게 만들기
//			Random random = new Random();
//			int correctNumber = random.nextInt(100) + 1;
//
//			System.out.println("수를 결정하였습니다. 맞추어 보세요: " + correctNumber + "\n1-100");
//			System.out.print("1>>");
//
//			// int answer = scanner.nextInt();
//
//			while (true) {
//				int answer = scanner.nextInt();
//				if (answer == correctNumber) {
//					break;
//				} else {
//					for (int i = 1; i < 100; i++) {
//						int[] preanswer = new int[100];
//						preanswer[answer-1] = answer;
//						
//						if() {
//							
//						} else {
//							
//						}
//						
//						
//						
//						
//						
//						System.out.print(i + 1 + ">>");
//					}
//					
//				}
//						
//							
//						 else if (answer > correctNumber) {
//							if (preanswer[i] <= answer) {
//								System.out.println("더 낮게\n" + preanswer[i] + '-' + answer);
//								break;
//							} else {
//								System.out.println("더 높게\n" + answer + "-" + preanswer[i]);
//								break;
//							}
//
//						} else {
//							if (preanswer[i] <= answer) {
//								System.out.println("더 낮게\n" + preanswer[i] + '-' + answer);
//								break;
//							} else {
//								System.out.println("더 높게\n" + answer + "-" + preanswer[i]);
//								break;
//							}
//						}
//
//					
//					
//					// 새 게임 여부 확인하기
////					System.out.print("다시 하겠습니까(y/n)>>");
////					if ("y".equals(answer) == false) {
////						break;
////					}
//				}
//			}
//		}
//		// scanner.close();
//	}
//
//}
