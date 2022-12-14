package ch07;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television myTv = new Television(); //객체 생성 => 메모리에 로딩
		System.out.println(myTv); //메모리 주소값 출력(해쉬코드)
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은" 
				+ myTv.volume + "입니다.");
		
		Television yourTv = new Television(); //객체생성시 참조변수 이름을 다르게 해야함(myTv / yourTv) (중요)
		System.out.println(yourTv);
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = false;
		System.out.println("나의 텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은" 
				+ yourTv.volume + "입니다.");

	}

}
