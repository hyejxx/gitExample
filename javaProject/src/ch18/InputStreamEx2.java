package ch18;

import java.io.IOException;

public class InputStreamEx2 {

	public static void main(String[] args) {
		int var = 0; //입력받는 문자를 숫자로 받아 처리하기 위한 변수
		System.out.println("내용을 입력하세요 : ");
		try {
			var = System.in.read();
			while(var != 13) {//엔터키를 입력할 때까지 반복 (pdf입출력 4페이지 참고)
				System.out.println(var + "==>" + (char)var);
				var = System.in.read();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
