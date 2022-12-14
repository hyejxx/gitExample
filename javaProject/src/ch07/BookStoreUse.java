package ch07;

public class BookStoreUse {

	public static void main(String[] args) {
		BookStore bs = new BookStore(); //객체 생성, 생성자는 메소드이다.
		bs.setBookName("Java");
		bs.setAuthor("김선생");
		bs.setPress("영진");
		bs.setYear(2022);
		bs.setAmount(10);
		bs.setPrice(30000);
		bs.print();

	}

}
