package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz5 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("quiz5.txt");
			
			// System.out: 화면(모니터)에 내용물 출력
			// FileWriter: 파일에 내용을 출력			
			for (int i = 1; i < 11; i++) {
				if (i % 2 == 0) {
					writer.write(i + " "); // write.write(i) = 함수의 인자로 숫자를 입력하면 문자로 변환된 후 출력됨
					// 숫자 + 문자 => 문자열 "2 "
					// 함수의 인자로 문자열을 입력하면 그대로 출력됨
				}
			}
			// 버퍼를 비워서 파일에 내용을 쓰기
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
