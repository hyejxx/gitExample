package ch18; //문제1

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy2 {

	public static void main(String[] args) {
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		String file1 = "D:\\test\\abc.txt";
		String file2 = "D:\\test\\abcCopy.txt";
		
		try {
			reader=new BufferedReader(new FileReader(new File(file1)));
			writer=new BufferedWriter(new FileWriter(new File(file2)));
			while (true) {
				str = reader.readLine();
				if(str==null) break; 
				writer.write(str+"\r\n");
			}
			System.out.println("[파일 복사가 완료되었습니다.]");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
