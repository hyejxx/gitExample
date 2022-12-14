package ch06;

public class VariantParam2 {
	static void print(String ...n) { //print 1
		for(int i = 0; i < n.length; i++) {
			System.out.println("과목 : " + n[i]);
		}
		System.out.println("-----------------");
	}
	
	static void print(int ...n) { //print 2
		int tot = 0;
		for(int i = 0; i < n.length; i++) {
			System.out.println("점수 : " + n[i]);
			tot = tot + n[i];
		}
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + String.format("%.1f", (double)tot/n.length));
	}

	public static void main(String[] args) {
		System.out.println("===상반기 과목===");
		print("Java","DB"); //매개변수의 갯수를 확인 2개(print1,2)
		print(99,88);
		System.out.println();
		System.out.println("===하반기 과목===");
		print("HTML","JSP","Spring");
		print(95,86,75);
	}

}
