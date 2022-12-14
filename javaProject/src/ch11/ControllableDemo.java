package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		TV t = new TV();
		t.remoteOn();
		t.remoteOff();
		t.repair();
		Controllable.reset();
		System.out.println();
		
		Computer c = new Computer();
		c.turnOn();
		c.turnOff();
		c.repair();
		Controllable.reset();
		System.out.println();
		
		Notebook note = new Notebook();
		note.turnOn();
		note.turnOff();
		note.repair();
		Controllable.reset();
		

	}

}
