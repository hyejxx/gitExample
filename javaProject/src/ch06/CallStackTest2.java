package ch06;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었습니다.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났습니다."); //프로그램끝 

	}

	public static void firstMethod() {
		System.out.println("firstMethod()이 시작되었습니다.");
		secondMethod();
		System.out.println("firstMethod()이 끝났습니다.");
		
	}

	public static void secondMethod() {
		System.out.println("secondMethod()이 시작되었습니다.");
		System.out.println("secondMethod()이 끝났습니다.");
		
	}

}
