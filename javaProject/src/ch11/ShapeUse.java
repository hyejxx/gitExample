package ch11;

public class ShapeUse {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.x = 100; //shape부모클래스에서 가져온것??
		r.y = 200;
		r.draw();
		
		Circle c = new Circle();
		c.x = 300;
		c.y = 300;
		c.draw();

	}

}
