package second_lesson_hw;

public class Two {
    public static void main(String[] args) {
        double m = 9.2;
        double n = 11;
        if (Math.abs(10-m)>Math.abs(10-n)){
            System.out.println("N under");
        }else if (Math.abs(10-m)==Math.abs(10-n)) {
            System.out.println("Chisla ravnie");
        }else {
            System.out.println("M under");
        }
    }
}
