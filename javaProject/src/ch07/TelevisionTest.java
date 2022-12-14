package ch07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television(); //new 생성자, 객체생성 인스턴스화(pdf클래스와 객체 p7참고)
		//System.out.println(tv);
		tv.channel = 7; //tv. => 인스턴스화된 Television 메모리의 주소값으로 접근
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("텔레비전의 채널은 " + tv.channel + "이고 " + tv.volume + "입니다.");

	}

}
