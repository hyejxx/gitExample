package ch02; //문제3(2022.11.07)

public class MyNameUnicode {

	public static void main(String[] args) {
		char aValue = '\uC624'; //오
		char bValue = '\uD61C'; //혜
		char cValue = '\uC8FC'; //주
		
		System.out.println("" + aValue + "" + bValue + "" + cValue);
		System.out.println("char형(\'\\uC624\') : " + aValue);
		System.out.println("char형(\'\\uD61C\') : " + bValue);
		System.out.println("char형(\'\\uC8FC\') : " + cValue);

	}

}