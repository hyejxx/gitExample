package ch07; //문제1

public class PersonUse2 {

	public static void main(String[] args) {
		Person2 p2 = new Person2();//객체생성,인스턴스화=>메모리에 올리는 작업
		p2.setName("홍길동");
		p2.setAge(30);
		p2.setEmail("hong@naver.com");
		p2.setAdress("서울 강남구 역삼동");
		
		Person2 p3 = new Person2();
		p3.setName("사임당");
		p3.setAge(25);
		p3.setEmail("saimdang@gmail.com");
		p3.setAdress("서울 강남구 서초동");

		System.out.println("이름 : "+p2.getName());
		System.out.println("나이 : "+p2.getAge());
		System.out.println("이메일 : "+p2.getEmail());
		System.out.println("주소 : " + p2.getAdress());
		System.out.println();

		System.out.println("이름 : "+p3.getName());
		System.out.println("나이 : "+p3.getAge());
		System.out.println("이메일 : "+p3.getEmail());
		System.out.println("주소 : " + p3.getAdress());

	}

}
