package ch06; //문제2

public class OverloadEx3 {

	public static void main(String[] args) {
		print("홍길동", "hong@gmail.com","010-1234-5678");
		print("이순신",99,87,76);
		print("김과장", 560);

	}
	static void print(String name, String email, String hp) {
		System.out.println("================================");
		System.out.println("이름\t이메일\t전화");
		System.out.println(name+"\t"+email+"\t"+hp);
	}
	

	static void print(String name, int kor, int eng, int mat) {
		System.out.println("================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+(kor+eng+mat)
				+"\t"+String.format("%.1f", (double)(kor+eng+mat)/3));
	}
	
	static void print(String kim, int pay) {
		int tax = (int)(pay * 0.3); //tax = 세금, pay = 급여, netpay = 실수령액
		int netpay = pay-tax;
		System.out.println("================================");
		System.out.println("이름\t급여\t세금\t실수령액");
		System.out.println(kim + "\t" + pay + "\t" + tax + "\t" + netpay);
	}


}
