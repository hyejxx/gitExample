package ch04; //문제1

import java.util.Scanner;

public class My_First_Project {

	public static void main(String[] args) {
		int menu = 0; //메뉴
		int numH = 0; //한식
		int numY = 0; //양식
		int numJ = 0; //중식
		Scanner sc = new Scanner(System.in); 
		
		outer : 
			while(true) {
				System.out.println("== [메 뉴] ==");
				System.out.println("[1] 한식");
				System.out.println("[2] 양식");
				System.out.println("[3] 중식");
				System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0) > ");
				String tmp = sc.next();
				menu = Integer.parseInt(tmp);
				
				if(menu == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if(menu < 1 || menu > 3) {
					System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
					continue;
				}
				if (menu == 1) {
					Han:
						for(;;) {
							System.out.println("(1) 부대찌개");
							System.out.println("(2) 된장찌개");
							System.out.println("(3) 삼겹살");
							System.out.println("(4) 보쌈");
							System.out.println("한식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99) > ");
							String Hans = sc.next();
							numH = Integer.parseInt(Hans);
							if(numH == 0) {
								System.out.println("한식메뉴 선택을 종료합니다.");
								break; 
							}
							if(numH == 99) {
								break outer; 
							}
							
						switch(numH) {
						case 1 :
							System.out.println("고객님은 부대찌개를 선택하셨습니다");
							continue;
						case 2 :
							System.out.println("고객님은 된장찌개를 선택하셨습니다");
							continue;
						case 3 :
							System.out.println("고객님은 삼겹살을 선택하셨습니다");
							continue;
						case 4 :
							System.out.println("고객님은 보쌈을 선택하셨습니다");
							continue;
						}
					}
				} else if(menu == 2) {
					Yang:
						for(;;) {
							System.out.println("(1) 돈까스");
							System.out.println("(2) 스테이크");
							System.out.println("(3) 햄버거");
							System.out.println("양식메뉴를 선택하세요.(양식메뉴선택종료:0, 전체종료:99) > ");
							String yangs = sc.next();
							numY = Integer.parseInt(yangs);
							if(numY == 0) {
								System.out.println("양식메뉴 선택을 종료합니다.");
								break; 
							}
							if(numY == 99) {
								break outer; 
							}
							
						switch(numY) {
						case 1 :
							System.out.println("고객님은 돈까스를 선택하셨습니다");
							continue;
						case 2 :
							System.out.println("고객님은 스테이크를 선택하셨습니다");
							continue;
						case 3 :
							System.out.println("고객님은 햄버거를 선택하셨습니다");
							continue;
						}
					}
				} else if(menu == 3) {
					Jung:
						for(;;) {
							System.out.println("(1) 짜장면");
							System.out.println("(2) 짬뽕");
							System.out.println("(3) 탕수육");
							System.out.println("중식메뉴를 선택하세요.(중식메뉴선택종료:0, 전체종료:99) > ");
							String Jungs = sc.next();
							numJ = Integer.parseInt(Jungs);
							if(numJ == 0) {
								System.out.println("중식메뉴 선택을 종료합니다.");
								break; 
							}
							if(numJ == 99) {
								break outer; 
							}
							
						switch(numJ) {
						case 1 :
							System.out.println("고객님은 짜장면을 선택하셨습니다");
							continue;
						case 2 :
							System.out.println("고객님은 짬뽕을 선택하셨습니다");
							continue;
						case 3 :
							System.out.println("고객님은 탕수육을 선택하셨습니다");
							continue;
						}
					}
				}
			}
		System.out.println("프로그램을 모두 종료합니다.");

	}

}
