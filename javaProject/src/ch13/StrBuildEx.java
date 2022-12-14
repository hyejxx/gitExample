package ch13; //문제3

public class StrBuildEx {
	public static void main(String[] args) {
		String str1 = "I am a ";
		String str2 = "Java Programmer";
		
		StringBuilder str3 = new StringBuilder();
		str3.append(str1);
		str3.append(str2);
		
		System.out.println("--------------------------------------------");
		str3 = str3.replace(7, 11, "JSP");
		System.out.println("append()메소드를 활용 : " + str1 + str2);
		System.out.println("replace()메소드를 활용 : " + str3);
		System.out.println("substring()을 활용 : " + str3.substring(7));
		System.out.println("--------------------------------------------");
	}
}