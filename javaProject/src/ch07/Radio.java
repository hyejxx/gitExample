package ch07;

public class Radio {
	double channel; //채널
	int volume; //볼륨
	boolean elecPower; //전원
	void print() {
		if(elecPower == true) {
			System.out.println("라디오가 켜져있습니다.");
		} else if(elecPower == false) {
			System.out.println("라디오가 꺼져있습니다.");
		}
		System.out.println("현재 채널은 " + channel + "입니다.");
		System.out.println("볼륨은 " + volume + "입니다.");
	}

}
