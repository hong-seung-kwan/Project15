package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 다운로드 폴더에 있는 파일 목록 읽어서 텍스트 파일에 출력
// 하위 폴더가 있다면, 하위폴더의 파일 목록도 출력
public class Quiz10 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("quiz10.txt");
		method("C:\\Users\\G201\\Downloads", writer, 0);

		writer.flush();
	}


	public static void method(String dirpath, FileWriter fileWriter, int level) throws IOException {
		File dir = new File(dirpath);

		File[] list = dir.listFiles();

		for (File file : list) {
			String fName = file.getName(); // 파일이름
			// 디렉토리인지 먼저 확인
			boolean isDirectory = file.isDirectory();
			String subDir = file.getPath(); // 경로 추출

			// 들여쓰기
			for (int i = 0; i < level; i++) {
				fileWriter.write("\t");
			}
			fileWriter.write(fName + "(" + isDirectory + ")" + "\n");

			// 만약 해당 파일이 디렉토리라면 다시 함수 호출
			if (isDirectory) {
				// 경로?
				// 파일의 이름?
				method(subDir, fileWriter, level + 1); // 폴더를 한번 더 들어가면 1만큼 증가 다시 호출되면 1 다시 호출되면 2... 증가
				
			}
		}

	}
}
