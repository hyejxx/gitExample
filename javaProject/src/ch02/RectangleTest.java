package ch02; //문제4(2022.11.07)

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int width;
		int height;
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		double wid = in.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		double hei = in.nextDouble();
		
		System.out.printf("직사각형의 넓이는 " + wid * hei + "입니다.");
		in.close();
	}

}