package ch10;

public class StaticVar2 {
	static int total; //static 메모리영역에 바로 로딩 / 초기값 = 0 / 공유메모리
	String model; //heap 영역에 생성됨(nonstatic은 new를 통해서 접근), (100번지)쏘나타, (200번지)모닝, (300)아반떼
	public StaticVar2(String model) {//매개변수가 있는 생성자
		this.model = model;
		total++; //카운팅(0(초기값), 1, 2, ...)
	}

}
