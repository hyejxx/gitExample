package ch02;

public class PrintfEx {
	
	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s = "java";
		double f = 3.14;
		
		// (참고 자료형과 변수 pdf p21)
		System.out.printf("%d\n", i); //%d정수가 1개일땐 i도 1개
		System.out.printf("%o\n", i); //%o 8진수로 141이 나온다. 
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i); 
		System.out.printf("%5d\n", d);
		System.out.printf("%-5d\n", d); //-가 왼쪽정렬을 한다.
		System.out.printf("%05d\n", d);
		System.out.printf("%,d\n", d); //3자리마다 콤마처리
		System.out.printf("%.1f\n", f); //전체자리수는 정하지 않고 소수점 1째자리까지만 지정
	}

}
