package ch08;
//main메소드를 만들어야 실행가능
public class Person {
	//멤버변수
	private String name;
	private int height;
	private int weight;
	
	//괄호가 들어가면 기본생성자(default constructor) 메소드
	public Person() {
		this("홍길동",170,60); //(String,int,int)
	}
	public Person(String name) {//name="추신수"
		this(name, 190, 100); //(String,int,int)
	}
	public Person(String name, int height) {//name="박찬호", height =185
		this(name, height, 70); 
	} //매개변수 3개짜리(11줄)를 생성했는데 public Person이라는 생성자를 만들었기때문에 에러가 안남
	public Person(String name, int height, int weight) { //name="홍길동", height=170, weight = 60
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	//출력용도
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
		
	}

}
