package ch04;//문제3

public class BreakEx4 {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		int i = 1;
		while (true) {
			System.out.println(i + " Hello World");
			i++;
			if (i >= 8 ) break;
		}
		System.out.println("n값이 8이며 while문 빠져나옴");
		System.out.println("------------------------------");

	}

}
