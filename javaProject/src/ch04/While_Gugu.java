package ch04; //문제2

import java.util.Scanner;

public class While_Gugu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 1;
		System.out.print("구구단 중에서 출력하고자 하는 단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		while (j <= 9) {
			System.out.println(dan + " x " + j + " = " + dan*j);
			j++;
		}
	}
}
