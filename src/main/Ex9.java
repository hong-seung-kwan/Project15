package main;

import java.io.FileWriter;
import java.io.IOException;

// 문자 스트림 -> Writer(출력)
public class Ex9 {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("writer.txt");
			
			// 문자 출력
			writer.write('A');
			// 문자열 출력
			writer.write("안녕하세요");
			// 특수기호 출력
			writer.write('\n'); // 줄바꿈
			
			writer.flush(); // 버퍼를 강제로 비우기
			
			// 버퍼란? 파일에 데이터를 쓰기전에 임시로 보관하는 공간
			// 버퍼가 가득차면 자동으로 내용이 출력됨
			// 하지만 버퍼가 차기전까지는 출력이 안됨
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

}
