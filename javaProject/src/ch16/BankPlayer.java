package ch16;

public class BankPlayer extends Thread {
	int type;
	MyBank MyBank;
	
	public BankPlayer(int type, MyBank MyBank) {
		this.type = type;
		this.MyBank = MyBank;
	}
	@Override
	public void run() {
		switch (type) {
		case 1: MyBank.myBankA(); break;
		case 2: MyBank.myBankB(); break;
		case 3: MyBank.myBankC(); break;
		}
	}
}
