package ch10; //문제2 2022.11.24

public class Poly3 {

	public static void main(String[] args) {
		String tel = "010-1234-5678";
		String addr = "서울 강남구 역삼동";
		Pa3 ch3 = new Ch3(); //다형성
		ch3.print();
		System.out.println("전화 : " + tel);
		System.out.println("주소 : " + addr);
	}

}
