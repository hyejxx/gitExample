package ch06;

public class VarianatParam {

	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","jsp");
		print("java","program","jsp","big","data");

	}
	
	static void print(String ...n) { //n이 가변형 매개변수 본인이 알아서 해줌
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
/*	static void print(String a) { 
		System.out.println(a);
	}

	
	private static void print(String b, String c, String d, String e, String f) {
		// TODO Auto-generated method stub
		
	}

	private static void print(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

	private static void print(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
*/
}
