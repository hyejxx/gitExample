package ch07;

public class StudentUse2 {

	public static void main(String[] args) {
		Student2 s2 = new Student2(); //객체생성
		s2.input("선덕여왕", "사회문학", 1, "198811", 3.8, 500);//데이터입력
		s2.print(); //데이터출력
		System.out.println(s2);

	}

}
