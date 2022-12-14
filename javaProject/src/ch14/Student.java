package ch14;

public class Student {
	private String num;
	private String name;
	private String major;
	private int year;
	private String Professer;
	
	public Student() {	
	}
	public Student(String num, String name, String major, int year, String professer) {
		super();
		this.num = num;
		this.name = name;
		this.major = major;
		this.year = year;
		Professer = professer;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getProfesser() {
		return Professer;
	}
	public void setProfesser(String professer) {
		Professer = professer;
	}
	
}
