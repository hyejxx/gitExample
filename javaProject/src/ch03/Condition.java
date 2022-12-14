package ch03;

public class Condition {

	public static void main(String[] args) {
		int num = -5;
		// System.out.println(num > 0 ? num : -num); //false ? true : false => 따라서 3번째 항을 선택, 결과 : -(-5) = 5, 3항 연산자, 부호 연산자
		if(num > 0) { //if문(제어문)
			System.out.println(num);
		}
		else {
			System.out.println(-num);
		}

	}

}
