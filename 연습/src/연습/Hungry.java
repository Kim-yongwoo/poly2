package 연습;

public class Hungry {

	public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
              if(i == 3) {
                 System.out.println("<3단>");
              }
              if(i == 5) {
                 System.out.println("<5단>");
              }
            for(int j = 1; j < 10; j++) {
               System.out.println(i  + " * " + j + " = " + (i*j));
         }
           System.out.println();
      }
}
}