package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력하세요");
		int num = scanner.nextInt();
		
		int sum = (num / 10 + num % 10);
		
		System.out.println("십의자리와 일의자리의 합은 "+ sum + "입니다");

	}

}
