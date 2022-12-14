package ch16;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start(); //run() 메소드가 돌아감
		
		synchronized (b) {
			System.out.println("b가 완료될때까지 기다립니다."); //1번째로 실행시작
			try {
				b.wait(); //main 스레드가 ThreadB에게 자신은 wait(일시정지)하겠다고 알림.
				//즉, wait()은 모니터링 락을 풀고, 다른스레드에서 notify(All)을 호출해주기를 기다린다.
				//notify가 도착하면 일시정지 상태에서 풀려나 실행을 이어 나간다.
			} catch (Exception e) { //3번째 마지막으로 실행 시작
				e.printStackTrace();
			}
			System.out.println("Total is : " + b.total);
		} //synchronized
	}

}

class ThreadB extends Thread {
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 5; i++) { //2번째로 실행시작
				System.out.println(i + "를 더합니다.");
				total += i; //total = total + i;
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}//for
			notify(); //wait하고 있는 스레들를 깨움
			
		}
	}
}