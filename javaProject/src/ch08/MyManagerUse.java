package ch08;

public class MyManagerUse {

	public static void main(String[] args) {
		//1)처음 생성 및 getInstance()호출
		MyManager mgrobj = MyManager.getInstance();
		System.out.println(mgrobj);
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore());
		
		//2)두번째 생성 및 호출
		MyManager newobj = MyManager.getInstance(); //싱글톤을쓰면 주소값을 불러냄?? 아님 주소값이 동일하게 나온다??
		System.out.println(newobj); //위 주소값과 같음
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore());

	}

}
