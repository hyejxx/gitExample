package ch10;

class K {//부모클래스
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}

class V extends K {//자식클래스
	int a = 20;
	public void print() {
		System.out.println(a);
	}
}

public class Poly {

	public static void main(String[] args) {
		V a = new V();
		a.print();
		K b = new K();
		b.print();
		
		//V c = new K(); //반드시 좌변은 부모, 우변은 자식 => 조심!!
		K c = new V(); //다형성(좌는 부모, 우는 자식)
		c.print();
		//다형성을 쓸 때 실제 참조변수가 가리키는 객체가 사용하고자 하는 객체가 맞는지를 검사할때
		//instanceof 연산자를 사용할 수 있다.
		System.out.println("c instanceof V? : " + (c instanceof V));

	}

}
