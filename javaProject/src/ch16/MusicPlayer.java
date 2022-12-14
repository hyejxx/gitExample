package ch16;

public class MusicPlayer extends Thread {
	int type;
	MusicBox musicBox; //공유객체 MusicBox 불러옴
	
	public MusicPlayer(int type, MusicBox musicBox) {//생성자 매개변수(type, musicBox) 2개짜리
		this.type = type;
		this.musicBox = musicBox;
	}
	
	@Override
	public void run() {
		switch (type) { //type이 무엇이냐에 따라서 musicBox의 메소드가 다르게 호출
		case 1: musicBox.playMusicA(); break;
		case 2: musicBox.playMusicB(); break;
		case 3: musicBox.playMusicC(); break;
		}
	}
}
