package second_lesson_hw;

import java.util.Random;

public class Four {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 100 + random.nextInt(900);

        int a = i/100;
        int b = i%100/10;
        int c = i%10;


        if ((a==b)&&(a==c)) {
            System.out.println("All number in "+ i + " is equal" );
        } else if ((a>=b)&&(a>=c)){
            System.out.println("Biggest number in "+ i + " is " + a);
        } else if ((b>=a)&&(b>=c)) {
            System.out.println("Biggest number in "+ i + " is " + b);
        } else if ((c>=a)&&(c>=b)) {
            System.out.println("Biggest number in "+ i + " is " + c);
        }
//        System.out.println(i);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
    }

}
