package ch10;

//static => 메모리에 바로 로딩
//nonstatic => 객체생성 후에 로딩
public class A {
	//멤버변수(Class 내에 선언되는 변수 / 클래스 전체에서 사용할 수 있는 변수)
	String name = "kim"; //nonstatic member
	static int n = 20; //static member
	//멤버메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}

	public static void main(String[] args) {//static member
		//지역변수(메소드 안에 선언한건 지역변수)
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		
		A aa = new A(); //굉장히 중요해 별5개
		System.out.println(aa.name);

	}

}
