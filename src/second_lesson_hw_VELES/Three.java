package second_lesson_hw;

import java.util.Random;

public class Three {
    public static void main(String[] args) {
        Random randomize = new Random();
        int i = randomize.nextInt(101) + 5;
        System.out.println(i);

        if ((i >25)&&(i<100)) {
            System.out.println("Number " + i + " inside (25-100)");
        }else {
            System.out.println("Number " + i + " not inside (25-100)");
        }

    }
}
