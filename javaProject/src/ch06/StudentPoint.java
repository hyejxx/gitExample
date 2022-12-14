package ch06; //문제1

public class StudentPoint {
	static int[] hak = {1001, 1002, 1003};
	static String[] name = {"홍길동","사임당","이순신"};
	static int[] Java = {90, 95, 84};
	static int[] DB = {85, 79, 92};
	static int[] HTML = {99, 88 ,95};
	static int [] JSP = {76, 92, 72};
	static int [] tot = {0, 0, 0};
	static double[] avg = {0.0, 0.0, 0.0};
	
	static void getTot() {
		for(int i = 0; i < tot.length; i++) {
			tot[i] = Java[i] + DB[i] + HTML[i] + JSP[i];
		}
	}
	
	static void getAvg() {
		for(int i = 0; i < avg.length; i++) {
			avg[i] = tot[i]/4.0;
		}
	}
	
	static void print() {
		for(int i = 0; i < hak.length; i++) {
			System.out.println(hak[i] + "\t" + name[i] + "\t" + Java[i] + "\t" + DB[i] + "\t" + HTML[i] + "\t" +
		JSP[i] + "\t" + tot[i] + "\t" + String.format("%.1f", avg[i]));
		}
	}

	public static void main(String[] args) {
		System.out.println("전체학생수 : " + hak.length + "명");
		System.out.println("---------------------------------------------------------------");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("---------------------------------------------------------------");
		getTot();
		getAvg();
		print();
		System.out.println("---------------------------------------------------------------");

	}

}
