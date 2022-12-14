package ch05; //문제2

public class ArraySum {
	public static void main(String[] args) {
		int [] num; //선언
		int sum = 0;
		
		num = new int[5]; //생성
		num[0] = 10; //저장
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			sum += num[i];
		}
		System.out.println("합계 : " + sum);
	}
}