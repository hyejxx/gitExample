package ch04; //문제3

public class Odd {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.printf("1부터 10까지의 홀수의 합은 = %d\n", sum);

	}

}
