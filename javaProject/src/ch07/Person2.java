package ch07; //문제1

public class Person2 {
		private String name; 
		private int age;
		private String email;
		private String adress;
		
		//getter, setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if(age < 0 || age > 150) {
				System.out.println("입력값이 정확하지 않습니다.");
			}else {
				this.age = age;
			}
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}
		
		public void print() {
			System.out.println("이름:"+name+", 나이:"+age+", 이메일:"+email+", 주소:"+adress);
		}
		
		public void print1() {
			System.out.println("이름:"+name+", 나이:"+age+", 이메일:"+email+", 주소:"+adress);
		}


}
