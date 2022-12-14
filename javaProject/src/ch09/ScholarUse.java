package ch09;

public class ScholarUse {

	public static void main(String[] args) {
		Scholar s1 = new Scholar(); //객체생성
		s1.input("김철수", "2203", "컴공", 1, "1종", 2500000);
		s1.print();
		System.out.println();
		
		Scholar s2 = new Scholar();
		s2.setName("홍길동"); 
		s2.setNum("2001");
		s2.setMajor("사회");
		s2.setYear(3);
		s2.print2();

	}

}
