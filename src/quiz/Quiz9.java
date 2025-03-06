package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// quiz8 함수로 변경
// 함수의 목적: 재사용성
public class Quiz9 {

	public static void main(String[] args) throws IOException {
		
		// 함수 호출할 때 폴더의 경로 설정
		method("C:\\hongseungkwan","quiz9-2.txt");
		method("C:\\hongseungkwan\\workspace","quiz9.txt");
		
	}

	// 폴더의 하위 파일 목록을 출력하는 함수
	// 매개변수? 대상 폴더
	// 반환값? 
	// 항상 downloads 폴더 파일 목록 출력하는 함수...
	// 디렉토리의 경로는 함수를 호출할때 결정
	// 출력할 파일도 함수를 호출할때 결정
	public static void method(String dirpath, String filename) throws IOException {
		File dir = new File(dirpath);

		File[] list = dir.listFiles();

		FileWriter writer = new FileWriter(filename);

		for (File file : list) {
			String fName = file.getName(); // 파일이름
			writer.write(fName + "\n");
		}
		writer.flush();
	}

}
