package main;

import java.io.IOException;

// 표준 입출력
public class Ex1 {

	public static void main(String[] args) {
		
		// System.out: 출력스트림
		// 화면(모니터)에 내용을 출력
		System.out.println("안녕하세요");
		
		// System.in: 입력스트림
		// 키보드를 통해 값을 입력
		try {
			int i = System.in.read();
			// read 함수는 입력받은 데이터를 바이트 값으로 저장함
			System.out.println(i); // 97 (a의 아스키코드)
			System.out.println((char)i); // int -> char
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
