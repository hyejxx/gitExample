package ch10; //문제1 2022.11.24

public class StaticMethod2 {
	//멤버변수
	static int num = 10; //사번
	static String name = "홍길동";
	String email = "hong@gmail.com";
	String hp = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	public static void printA() {
		System.out.println("사번 : " + num);
		System.out.println("이름 : " + name);
		StaticMethod2 e = new StaticMethod2();
		System.out.println("이메일 : " + e.email);
		StaticMethod2 h = new StaticMethod2();
		System.out.println("전화 : " + h.hp);
		StaticMethod2 a = new StaticMethod2();
		System.out.println("주소 : " + a.addr);
	}
	
	public static void printB() {
		System.out.println("사번 : " + num);
		System.out.println("이름 : " + name);
		StaticMethod2 e1 = new StaticMethod2();
		System.out.println("이메일 : " + e1.email);
		StaticMethod2 h1 = new StaticMethod2();
		System.out.println("전화 : " + h1.hp);
		StaticMethod2 a1 = new StaticMethod2();
		System.out.println("주소 : " + a1.addr);
	}

	public static void main(String[] args) {
		System.out.println("====printA()====");
		printA();
		System.out.println();
		System.out.println("====printB()====");
		printB();

	}

}
