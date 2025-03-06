package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz8 {

	public static void main(String[] args) throws IOException {
		
		// File: 파일의 속성을 조회할 수 있는 클래스
		// 인자: 파일의 경로 or 폴더의 경로		
		File dir = new File("C:\\Users\\G201\\Downloads");
		
		// 다운로드 폴더 아래 하위 파일들의 리스트
		File[] list = dir.listFiles();
		
		// 문자스트림 + 출력스트림
		// 파일의 이름에 한글이 포함되어 있으므로 문자스트림 사용!
		// 해당 파일이 없으면 자동으로 파일 생성됨
		FileWriter writer = new FileWriter("quiz8.txt");
		
		for(File file:list) {
			String filename = file.getName(); // 파일이름
			writer.write(filename+ "\n");			
		}
		writer.flush();

	}

}
