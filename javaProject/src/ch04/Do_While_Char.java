package ch04;

public class Do_While_Char {

	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			c = (char)(c+1); //아스키값에다가 1을 계속 더하는것, 영문의 경우 1을 더하면 다음문자의 코드 값
		} while(c <= 'z');

	}

}
