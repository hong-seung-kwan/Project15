package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 스트림 - 출력 스트림
// 배열을 이용하여 파일 쓰기
public class Ex7 {

	public static void main(String[] args) {

		try {
			FileOutputStream stream = new FileOutputStream("output2.txt");

			// 배열 생성
			byte[] arr = { 65, 66, 67 };

			// 배열에 있는 내용을 한번에 쓰기
			stream.write(arr);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
