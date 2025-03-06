package main;

import java.io.File;
import java.io.IOException;

//File 클래스
public class Ex13 {

	public static void main(String[] args) throws IOException {
		
		// File: 파일의 정보를 담는 클래스
		// 파일경로, 파일이름, 파일크기 등을 확인할 수 있음
		// 폴더를 구분하는 구분자: \\
//		File file = new File("C:\\hongseungkwan\\newfile.txt");
//		
//		// 실제 파일 생성
//		file.createNewFile();
//		
//		System.out.println(file.isFile()); // 파일인지?
//		System.out.println(file.isDirectory()); // 디렉토리인지?
//		System.out.println(file.getName()); // 파일의 이름
//		System.out.println(file.getAbsolutePath()); // 파일경로
//		System.out.println(file.getPath()); // 파일경로
//		System.out.println(file.canRead()); // 읽을 수 있는 파일인지
//		System.out.println(file.canWrite()); // 쓸수 있는 파일인지
//		
//		// 실제 파일 삭제
//		file.delete();
		
		// 다운로드 폴더
		File dir = new File("C:\\Users\\G201\\Downloads");
		
		// 폴더 안에 있는 파일 목록 조회
		File[] files = dir.listFiles();
		
		for(File file:files) {
			System.out.println(file);
		}
		
	}

}
