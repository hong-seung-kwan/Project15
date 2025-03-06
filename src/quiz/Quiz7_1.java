package quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7_1 {

	public static void main(String[] args) throws IOException {
		
		// FileOutPutStream: 바이트 스트림 + 출력 스트림
		// 데이터를 1바이트씩 처리하여 파일에 쓰는 스트림
		FileOutputStream stream = new FileOutputStream("quiz7_1.txt");
		
		// 바이트 스트림은 한글을 입력할 수 없다
//		stream.write('프');
		
		// 한글 입력하는 방법
		// 1. 문자스트림 사용
		// 2. 바이트스트림 + 보조스트림사용
		
		// 보조스트림은 기반스트림이 없으면 생성 x
		OutputStreamWriter streamWriter = new OutputStreamWriter(stream);
		
		// 보조스트림을 사용하여 문자열 입력
		streamWriter.write("프로그래밍");
				
		// FileOutputStream은 버퍼 x
		// OutputStreamWriter는 버퍼 o		
		// OutputStreamWriter는 버퍼를 비워서 내용 출력해야함
		streamWriter.flush();
	}

}
