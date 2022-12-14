package ch05; //문제2 /ForPoint 참고

public class ArrayScore2D {

	public static void main(String[] args) {
		int [][] score = {{100,100,100}, {89,76,92}, {88,69,72}, {45,60,59}, {96,92,89}};
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			char grade =' ';
			float avg = 0.0f;
			System.out.printf("%d\t", i+1); 
			for(int j = 0; j < score[i].length; j++) { 
				System.out.printf("%d\t", score[i][j]);
				sum += score[i][j];
			}
			avg = sum/(float)score[i].length;
			if(avg >= 90) {
				grade = 'A';
			} else if(avg >= 80) {
				grade = 'B';
			} else if(avg >= 70) {
				grade = 'C';
			} else if(avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.printf("%d\t %.1f\t %s%n", sum, avg, grade);
		}

	}

}
