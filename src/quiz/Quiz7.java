package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {

	public static void main(String[] args) throws IOException {

//		try {
//			FileOutputStream fileOutputStream = new FileOutputStream("quiz7.txt");
//			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//
//			outputStreamWriter.write("프로그래밍");
//			outputStreamWriter.flush();
//
//			File dir = new File("C:\\Users\\G201\\Downloads");
//
//			File[] files = dir.listFiles();
//
//			try (FileWriter fileWriter = new FileWriter("quiz7.txt")) {
//				for (File file : files) {
//					String download = file.getName();
//					fileWriter.write(download + "\n");
//				}
//				fileWriter.flush();
//			}
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
		
		String filepath = "C:\\Users\\G201\\Downloads";
		FileWriter fileWriter = new FileWriter("quiz7.txt");
		
		DownloadList(filepath, fileWriter);
		
	}
		
	
	public static void DownloadList(String filepath, FileWriter fileWriter){
		
		File dir = new File(filepath);
		
		File[] files = dir.listFiles();
		
		try {
//			FileWriter fileWriter = new FileWriter(dir);
			
			for(File file:files) {
				String download = file.getName();
				fileWriter.write(download+"\n");
			}
			fileWriter.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	

}
