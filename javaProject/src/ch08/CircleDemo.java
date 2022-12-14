package ch08;

class Circle { //public X class로 생성
   double radius;
   String color;
   public Circle(double r, String c) { //return 될게없어도 void는 쓰면안됨
      radius = r; //radius랑 r이랑 다르니까 this 사용 안함
      color = c;
   }
   public Circle(double r) {
   radius = r;
   color = "파랑";
}
   public Circle(String c) {
      radius = 21.0;
      color = c;
   }
   public Circle() {
      radius = 3.5;
      color = "빨강";
   }
   //출력영도
   public void print() {
      System.out.println("반지름 : " + radius);
      System.out.println("색깔 : " + color);
      
   }
}

public class CircleDemo {
   public static void main(String[] args) {
      
      Circle c1 =new Circle (3.3, "빨강");
      c1.print();
      
      Circle c2 = new Circle(5.0);
      c2.print();
         
      Circle c3 = new Circle("노랑");
      c3.print();
      
      Circle c4 = new Circle();
      c4.print();
   }

}