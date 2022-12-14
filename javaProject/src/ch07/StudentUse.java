package ch07;

public class StudentUse {

	public static void main(String[] args) {
		//객체 생성
		Student s1 = new Student();
		//데이터입력
		s1.setName("이순신");
		s1.setMajor("컴퓨터");
		s1.setYear(4);
		s1.setNum("1924034");
		s1.setPoint(3.69);
		s1.setMoney(403);
		s1.print();

	}

}
