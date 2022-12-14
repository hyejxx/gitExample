package ch01;

public class Money { //프로그래밍 언어응용(문제해결시나리오)
	public static final String UNIT = "원";
	//public int money; //이거 아님
	private int money; //이게 맞음
	
	public Money(int money) {
		this.money = money;
	}
	
	//getter, setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static String getUnit() {
		return UNIT;
	}
	
	public void print() {
		System.out.println(money + UNIT + "이 있습니다.");
	}

}
