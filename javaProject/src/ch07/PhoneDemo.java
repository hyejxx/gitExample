package ch07;

//한개의 파일에 2개이상의 class 파일을 작성시에는 public class의 클래스 이름으로 저장, public처리,
//나머지 클래스는 default로 처리
class Phone { 
	String model;
	int value;
	void print() {
		System.out.println(value + "만원 짜리" + model + "스마트폰");
	}
	
}

public class PhoneDemo {

	public static void main(String[] args) {
		Phone myPhone = new Phone(); //객체 생성
		myPhone.model = "아이폰 14pro";
		myPhone.value = 155;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "Galaxy";
		yourPhone.value = 120;
		yourPhone.print();
		

	}

}
