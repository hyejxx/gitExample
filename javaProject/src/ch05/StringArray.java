package ch05;

public class StringArray {

	public static void main(String[] args) {
		String[] str = {"Java","DB","JSP","HTML"};
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//확장 for문(향상된for문, for~each문) => jdk1.5이상부터 사용가능
		//for(개별값 저장 변수 : 집합변수){} /더 간단히 쓸수있다.
		for(String b : str) { //i++라는게 안에 매장되어있다. 그래서 위에 7줄이랑 같은 의미.
			System.out.println(b);
		}

	}

}
