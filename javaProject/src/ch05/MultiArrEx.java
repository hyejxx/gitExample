package ch05; //문제3

import java.util.Scanner;

public class MultiArrEx {

	public static void main(String[] args) {
		//3행 2열의 배열
		String[][] words = {{"char","의자"} //words[0][0], words[0][1]
		,{"computer","컴퓨터"} //words[1][0], words[1][1]
		,{"integer", "정수"}}; //words[2][0], words[2][1]
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.printf("문제%d) %s의 뜻은? ", i + 1, words[i][0]);
			String tmp = scanner.next();
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			}else if(tmp.equals("-1")){
				System.out.println("프로그램을 종료합니다."); break;
			}
			else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.(종료 : -1)%n%n", words[i][1]);
			} i++;
			if(i == words.length) {
				i = 0;
			}

		}
		scanner.close();

	}

}
