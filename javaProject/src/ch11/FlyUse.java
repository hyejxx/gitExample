package ch11;

public class FlyUse {

	public static void main(String[] args) {
		System.out.println("=====일반기법=====");
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		Airplane a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		System.out.println("=====다형성기법=====");
		
		//실무에서는
		Flyer f = new Bird(); //좌변은 부모, 우변은 자식 => 다형성 기법
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Airplane(); //참조변수
		f.takeOff();
		f.fly();
		f.land();

	}

}
