package ch02;

public class CharEx {

	public static void main(String[] args) {
		char aValue = '\u0041'; //유니코드 0041은 대문자 A
		System.out.println("char형('\u0041') : " + aValue);
		
		char bValue = '\u0041'; //유니코드 0041은 대문자 A
		System.out.println("char형(\'\\u0041\') : " + bValue); //추가로 역슬래시를 붙이면 결과가 A가 아닌 \u0041나옴
		// \' = single quote를 표현
		// \\ = 역슬래시(BackSlash)를 표현

	}

}
