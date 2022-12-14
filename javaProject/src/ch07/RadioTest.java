package ch07;

public class RadioTest {

	public static void main(String[] args) {
		Radio briz = new Radio();
		System.out.println("[브리츠 라디오]");
		briz.elecPower = true; //켜져있는지
		briz.channel = 89.1;
		briz.volume = 12;
		briz.print();
		System.out.println();
		Radio iriver = new Radio();
		System.out.println("[아이리버 라디오]");
		iriver.elecPower = false; //꺼져있는지
		iriver.channel = 95.1;
		iriver.volume = 9;
		iriver.print();
	}

}
