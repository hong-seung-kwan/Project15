package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 스트림 - 출력 스트림
public class Ex6 {

	public static void main(String[] args) {

		try {
			// output.txt가 있으면 연결되고, 없으면 자동으로 생성됨
			// 파일 안나타나면 새로고침!
			FileOutputStream stream = new FileOutputStream("output.txt");

			stream.write(65); // 파일에 쓰기 . 1바이트씩 파일에 작성
			stream.write(66); // 문자로 변환된 후에 입력됨
			stream.write('C'); // 문자 그대로 입력됨
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
