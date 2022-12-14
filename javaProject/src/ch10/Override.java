package ch10;

class Test1 {
	public void print() {
		System.out.println("test1");
	}
}

class Test22 extends Test1 {
	public void print() {//오버라이딩 : 상속과 관련이 있다.
		System.out.println("test22");
		super.print(); //부모 메소드 호출
	}
}

public class Override {

	public static void main(String[] args) {
		Test22 t = new Test22();
		t.print();

	}

}
