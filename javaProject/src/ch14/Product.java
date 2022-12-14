package ch14; //문제1

import java.util.Scanner;

public class Product {
	private String no; //제품번호
	private String noname; //제품명
	private String company; //제조사
	private int price; //단가
	private int amount; //수량
	private int money; //금액 (단가*수량)
	
	public void put() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품번호 : ");
		no = sc.next();
		System.out.print("제품명 : ");
		noname = sc.next();
		System.out.print("제조사 : ");
		company = sc.next();
		System.out.print("단가 : ");
		price = sc.nextInt();
		System.out.print("수량 : ");
		amount = sc.nextInt();
		
		money = price * amount;
		System.out.println("-------------------------------------------------");
	}
	
	//getter, setter
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getNoname() {
		return noname;
	}
	public void setNoname(String noname) {
		this.noname = noname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

}
