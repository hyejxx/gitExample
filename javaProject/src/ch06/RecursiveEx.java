package ch06;

//재귀호출 - 실제로 잘 사용 안함(메모리가 증가하기때문에 좀 조심해야함)
public class RecursiveEx {
	static long fact1(int n) { //5
		return n == 1 ? 1 : n*fact1(n-1); //메소드여서 본인은 본인을 부른다, 5*4*3*2*1
	}

	public static void main(String[] args) {
		System.out.println(fact1(5));

	}

}
