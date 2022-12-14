package ch07;

public class Television {
	//멤버변수 (전역, 필드)
	int channel; //채널 7 | 다른메모리에 9  | 또다른 메모리 11
	int volume; //볼륨  |   다른메모리에 12 (서로 구분)
	boolean onOff; //전원 상태 true |  다른메모리에 false로 기억
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	 int getChannel() {
		return channel;
	}
	 void setChannel(int ch) { 
		 channel = ch;
	 }

}
