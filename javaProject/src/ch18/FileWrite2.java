package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite2 {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("D:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
			while(true) {
				int ch = System.in.read();
				if(ch == 13) break;
				os.write(ch);
			}
			System.out.println("[파일이 저장되었습니다.]");
		} catch (Exception e) {
			System.out.println("[파일저장이 실패했습니다.]");
			e.printStackTrace();
		}

	}

}
