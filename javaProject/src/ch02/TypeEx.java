package ch02;

public class TypeEx {

	public static void main(String[] args) {
		int mach; //mach = 마하
		int distance;
		mach = 340; //소리는 1초에 340m를 이동함
		distance = mach * 60 * 60;
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");
		
		//실수는 거의 대부분 float보다 double를 쓴다.
		double radius;
		double area;
		radius = 10.0; //반지름이라고 가정 10.0에서 .0안써도 10이라고 해도 10이라고 인식하지만 가급적 소숫점도 쓰면 좋음
		area = radius * radius * 3.14; //area는 원 넓이 구하기라고 가정
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);

	}

}
