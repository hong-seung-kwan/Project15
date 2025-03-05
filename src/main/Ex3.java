package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 바이트 스트림: 1byte씩 처리
// 바이트 스트림 > 입력 스트림
public class Ex3 {

	public static void main(String[] args) {
		
		// 입력 스트림 생성
		try {
			FileInputStream stream = new FileInputStream("input.txt");
			
			// 파일 안에 내용 읽어오기
			// read: 파일에 내용을 한글자씩 읽어오는 함수
			System.out.println(stream.read());
			System.out.println(stream.read());
			System.out.println(stream.read());
			
			// 스트림은 사용하면 닫힘. 재사용할 수 없음
			FileInputStream stream2 = new FileInputStream("input.txt");
			
			System.out.println((char)stream2.read());
			System.out.println((char)stream2.read());
			System.out.println((char)stream2.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
