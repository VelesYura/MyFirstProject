package Serg_HW;

public class firstHW {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
           // System.out.println(a);
            sum += i;
            if (sum >1000){
                System.out.println("сумма равна " + sum + " последнее добавленное число: " + i);
                break;
            }

        }
    }
}


