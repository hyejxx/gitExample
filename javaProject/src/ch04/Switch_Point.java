package ch04;

public class Switch_Point {

	public static void main(String[] args) {
		int kor=85;
		int eng=90;
		int mat=70;
		int tot=kor+eng+mat;
		double avg = tot / 3.0;
		String grade = "";
		
		switch ((int)(avg / 10)) { //double을 int변환(강제형변환)
		case 10:
		case 9: grade = "수"; break;
		case 8: grade = "우"; break;
		case 7: grade = "미"; break;
		case 6: grade = "양"; break;
		default: grade = "가";
			
		}
		//결과 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급\t");
		System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s", kor, eng, mat, tot, avg, grade); //f실수 s문자열

	}

}