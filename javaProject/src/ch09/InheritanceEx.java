package ch09;

public class InheritanceEx {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨강색"); //객체생성과 동시에 매개변수가 있는 생성자 호출
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("공 : ");
		c2.findRadius(); //Circle멤버
		c2.findColor();//Ball 멤버
		c2.findArea();//Circle멤버
		c2.findVolume();//Ball멤버
		
		Circle c3 = new Circle(4); //생성자는 상속의 대상이 아니라 고유한 객체로서 사용되어진다.
		Ball c4 = new Ball();

	}

}

//Ball c2 = new Ball("빨강색")을 ("빨강색") 빼면 에러남. 이유는 Ball클래스에서 
// 기본생성자를 안만들었기 때문 public Ball() {}를 안만들어서 에러남 만약에 기본생성자를
// 만들면 ("빨강색")빼도 에러가 안남 근데 만약 기본생성자를 안만들면 매개변수가 있는
//생성자를 호출해야함