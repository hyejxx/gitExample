package ch02; //문제1(2022.11.07)

public class Box {

	public static void main(String[] args) {
		double area; //넓이
		double per; //둘레
		double width; //가로
		double length; //세로
 		
		width = 10.0;
		length = 5.0;
		area = width * length;
		per = 2.0 * (width + length);
		
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + per);
	}

}