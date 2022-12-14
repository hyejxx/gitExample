package ch07;
//getter, setter를 사용안하고 접근하는 기법
public class Student2 {
	//멤버변수
	private String name;
	private String major; //전공
	private int year; //학년
	private String num; //학번
	private double point; //평점평균
	private int money; //등록금
	private int save; //장학금

	//매개변수(String(name,major,year...)괄호 안에있는게 매개변수), 전역변수 = 지역변수??(this.name = name)
	public void input(String name, String major, int year, String num, double point, int money) {
		this.name = name;
		this.major = major;
		this.year = year;
		this.num = num;
		this.point = point;
		this.money = money;

		//장학금 계산(3.5이상 100만원, 4.0이상 250만원, 4.3이상 전액)
		if(point >= 4.3) {
			save = money;
		} else if(point >= 4.0) {
			save = 250;
		} else if(point >= 3.5) {
			save = 175;
		}
	}
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+
		point+"\t"+money+"\t"+save);
	}
	@Override //마우스 우클릭 -> source -> generate toString(), 개발자용 메소드
	public String toString() {
		return "Student2 [name=" + name + ", major=" + major + ", year=" + year + ", num=" + num + ", point=" + point
				+ ", money=" + money + ", save=" + save + "]";
	}
	

}