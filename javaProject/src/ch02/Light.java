package ch02;

public class Light {

	public static void main(String[] args) {
		//long타입 = 8바이트(64비트) 정수를 저장 , 엄청 큰 수를 하기위해서는 long이 필요, int가 하기에는 너무 큰 수임.(참고 pdf자료형과 변수 p14)
		long lightspeed; 
		long distance;
		
		lightspeed = 300000L; //long뒤에는 L을 쓰는건데 L,l 생략도 가능
		distance = lightspeed * 365L * 24 * 60 * 60; //빛이 1년 동안 가는 거리 = 빛의 속도 * 365일 * 24시 * 60분 * 60초;
		System.out.println("빛이 1년 동안 가는 거리 : " + distance + "km"); // "문자열" + "변수" + "문자열"

	}

}
