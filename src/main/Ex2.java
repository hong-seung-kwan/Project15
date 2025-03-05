package main;

import java.util.Scanner;

// Scanner 클래스
public class Ex2 {

	public static void main(String[] args) {
		
		// Scanner는 보조 클래스
		// 인자로 입력스트림을 입력
		Scanner scanner = new Scanner(System.in);
		
		// nextLine: 문자열을 입력받는 함수
		System.out.println("이름: ");
		String name = scanner.nextLine();
		
		// nextInt: 숫자를 입력받는 함수
		System.out.println("나이: ");
		int age = scanner.nextInt();
		
		System.out.print(name+" ");
		System.out.print(age);
		

	}

}
