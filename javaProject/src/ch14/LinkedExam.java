package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		//큐 구조 : FIFO(First In First Out)
		String[] fruits = {"배", "샤인머스캣", "바나나", "체리", "수박"};
		LinkedList<String> list = new LinkedList<>();
		for(String str : fruits) {
			list.offer(str); //저장은 offer 추출은 poll, 큐 구조에 자료 입력
		}
		String str = "";
		while((str=(String)list.poll()) != null) { //poll()  자료 꺼내기
			System.out.println(str + "가(이) 삭제되었습니다.");
		}

	}

}
