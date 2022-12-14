package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank bank = new MyBank();
		BankPlayer A = new BankPlayer(1, bank);
		BankPlayer B = new BankPlayer(2, bank);
		BankPlayer C = new BankPlayer(3, bank);
		A.start();
		C.start();
		B.start();
	}
}
