package ch05;

public class CharArray {

	public static void main(String[] args) {
		// char[] ch = {'J', 'a', 'v', 'a'}; //약식배열
		char [] ch; //배열참조변수 선언
		ch = new char[4]; //배열생성과 동시에 배열의 갯수처리
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//배열참조변수.length => 배열의 사이즈 / 숫자 보다는(i<4) 참조변수.length로 해야 정확히 할수있다.
		for(int i = 0; i < ch.length; i++) {
			System.out.println(i+"번째 문자 : "+ch[i]);
		}

	}

}
