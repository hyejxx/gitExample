package ch01;

public class Run { //프로그래밍 언어응용(문제해결시나리오)
	public static void main(String[] args) {
		//Money m = new Money(); //이거아님
		Money m = new Money(0); //이게 맞음
		m.setMoney(10000);
		m.print();
	}

}

//원인
//1. 매개변수 있는 생성자가 있어 기본 생성자가 생기지 않았기 때문에 Run에서 오류
//2. 클래스 다이어그램에는 - 기호인데 코드에는 public 접근제한자임

//조치내용
//1.코드에서 score필드의 접근제한자를 private로 수정
//2.기본 생성자를 이용하지 않고 매개변수 있는 생성자를 이용해 money 초기화