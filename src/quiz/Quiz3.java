package quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// while: 반복횟수가 명확하지 않을때
		while(true){
			System.out.println("문자를 입력하세요: ");
			String str = scanner.nextLine();
			
			if(str.equalsIgnoreCase("stop")) { // 대소문자 상관없이 비교
				break;
			}
			if(str.toUpperCase().equals("STOP")) { // 대문자로 변환 후 비교
				break;
			}
			if(str.toLowerCase().equals("stop")) { // 소문자로 변환 후 비교
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다");
	}

}
