package ch11;

public class Airplane implements Flyer {//인터페이스는 임플리먼트(다중상속?)

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙");

	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");

	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙");

	}

}
