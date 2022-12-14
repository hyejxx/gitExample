package ch05; 

public class ArraySum_1 {

	public static void main(String[] args) {
		int [] num = {10,20,30,40,50}; //약식배열처리
		int sum = 0; //배열의 합계를 저장할 변수
		
		for(int i = 0; i < 5; i++) {
			sum += num[i]; //sum = sum + num[i]
		}
		
		//for(int i = 0; i < num.length; i++) { //참조변수.length는 배여르이 갯수값을 가져온다.
		//	sum += num[i]; //sum = sum + num[i]
		//}
		
		System.out.println("합계 : " + sum);

	}

}
