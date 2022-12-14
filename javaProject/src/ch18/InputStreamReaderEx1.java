package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	//InputStream : 1바이트 단위로 읽음
	//InputStreamReader : 문자 단위(2byte)로 읽음
	public static void main(String[] args) {
		InputStream is = System.in; //1byte
		//new ~Reader(Stream) => ~Reader계열 괄호 안에는 inputStream 이나 outputStream 등 써야된다.
		InputStreamReader isr = new InputStreamReader(is); //2byte
		System.out.println("한글자를 입력하세요 : ");
		try {
			int code = isr.read(); //글자의 코드값 
			System.out.println("code : " + code); //글자의 코드값 출력
			char ch = (char)code;
			System.out.println("char : " + ch);
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
