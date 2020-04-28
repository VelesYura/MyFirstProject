package second_lesson_hw;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int n = sc.nextInt();

        if (n>=0){
            //int result = 1;
            for (int i=n; i>0; i--){
                int result = n%i;
                if (result ==0) {
                    System.out.println(i);
                }
            }
          //  System.out.println(result);

        } else {
            System.out.println("Число должно быть положительным");
        }

    }
}
