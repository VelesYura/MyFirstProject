package second_lesson_hw;

public class Five {
    public static void main(String[] args) {
        int a = -543;
        int b = 45;
        int c = -33;

        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.println("increment number list "+ c + " "+b+ " "+a);
            }else{
                System.out.println("increment number list "+ b + " "+c+ " "+a);
            }
        }
        if ((b>a)&&(b>c)){
            if (a>c){
                System.out.println("increment number list "+ c + " "+a+ " "+b);
            }else{
                System.out.println("increment number list "+ a + " "+c+ " "+b);
            }
        }
        if ((c>a)&&(c>b)){
            if (a>b){
                System.out.println("increment number list "+ b + " "+a+ " "+c);
            }else{
                System.out.println("increment number list "+ a + " "+b+ " "+c);
            }
        }
    }
}
