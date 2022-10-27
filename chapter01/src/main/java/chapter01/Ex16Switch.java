package chapter01;

public class Ex16Switch {
// Ex13 참고
	public static void main(String[] args) {
		char grade = ' ';
		int score = 92;
		
		switch(score / 10) {
			case 10:   // score = 100
			case 9: {  // 90<= score <= 99
				grade = 'A';
				break;
			} 
			case 8: {  // 80<= score <= 89
				grade = 'B';
				break;
			} 
			case 7: {  // 70<= score <= 79
				grade = 'C';
				break;
			} 
			case 6: {  // 60<= score <= 69
				grade = 'D';
				break;
			} 
			default: {  // score <= 59
				grade = 'F';
				break;
			}
		}
		
		System.out.println("학점은 " + grade + "입니다.");

	}

}
