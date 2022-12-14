package ch09;

public class Volume extends Area {
	//멤버변수
	private int height;
	public Volume() {
		
	}
	
	public Volume(int height, int length, int width) { //VolumeUse에서 height=10, length=20, width = 30
		super(width, length); //부모클래스의 생성자 호출
		this.height = height;
	}
	public int getVolume() {
		return getArea()*height; //오버라이딩, 0*0
	}

}
