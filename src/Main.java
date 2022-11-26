import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        helloWord();
        hello(" DŨNG");


        Main baitap1 = new Main();
        baitap1.sayHello("Trung Dũng");

        int data = sumNumber(3, 4);
        System.out.println(data);

        int datab = summer(5);
        System.out.println(datab);


        int datac = theky(2022);
        System.out.println(datac);
    }


    public static void helloWord() {
        System.out.println(" Xin Chào Các Bạn");
    }

    public static void hello(String X) {
        System.out.println(" Xin Chào  " + X);
    }

    public void sayHello(String name) {
        System.out.println(" Xin Chào " + name);
    }

    public static int sumNumber(int a, int b) {
        int result = a + b;

        return result;
    }

    public static int summer(int c) {
        int square = c * c;

        return square;
    }

    public static  int theky (int n) {
        int theky = n/100 +1 ;
        return theky ;
    }



}