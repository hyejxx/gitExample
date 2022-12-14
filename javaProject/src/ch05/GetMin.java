package ch05;

public class GetMin {

	public static void main(String[] args) {
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		int min;
		
		min = s[0]; //12
		for(int i = 0; i<s.length; i++) {
			if(s[i] < min) { //12 < 3, 12 < 19, 12 < 6... 12 < 1, 12 < 19 비교 => 최솟값은 1
				min = s[i];
			}
		}
		System.out.println("최소값은 " + min);

	}

}
