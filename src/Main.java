import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        helloWord();
        hello(" DŨNG");
        sum( " DŨNG");


         int data = sumNumber(3 ,4);
        System.out.println(data);

        int datab = summer(5);
        System.out.println(datab);

    }
     private static void helloWord(){
         System.out.println(" Xin Chào Các Bạn");
     }

     private static void hello(String X) {
         System.out.println(" Xin Chào  " + X );
     }
     private static void sum (String X) {
         System.out.println( " Xin chào " + X );
     }
        public static int sumNumber ( int a , int b) {
            int result = a + b;

            return result;
        }
        public static int summer ( int c) {
            int square = c*c;

            return square;
        }

}