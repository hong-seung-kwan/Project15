package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 바이트 스트림 > 입력 스트림
public class Ex4 {

	public static void main(String[] args) {

		try {
			FileInputStream stream = new FileInputStream("input2.txt");

			// 반복문을 이용하여 파일 읽기
			while (true) {
				int i = stream.read();
				if (i == -1) { // 파일에 끝에 도달했을때
					break;
				}
				System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}


// 바이트 스트림은 한글을 읽어올 수 없다
// 한글은 2바이트로 표현 가능