package ch16;

public class MusicBoxExam1 {
	public static void main(String[] args) {
		MusicBox box = new MusicBox(); //MusicBox 인스턴스 생성(매개변수가 있는 생성자 사용)
		
		MusicPlayer kim = new MusicPlayer(1, box);
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer park = new MusicPlayer(3, box);
		
		//MusicPlayer 스레드 실행
		kim.start();
		lee.start();
		park.start();
		//Thread는 cpu에서 우선순위로 실행하기때문에 순서가 뒤죽박죽이다.

	}

}
