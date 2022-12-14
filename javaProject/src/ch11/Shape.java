package ch11;

public abstract class Shape {
	int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); //body가 없는{} 추상메소드

}
