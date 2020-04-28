package MyLessons;

//Call methods

import jdk.security.jarsigner.JarSignerException;

public class MyClass {
    static void checkEnter (int age, double money) {
        if (age>=21 && money>=1000.0){
            System.out.println("Welcome");
        } else{
            System.out.println("Go away");
        }
    }

    static int max (int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        checkEnter(115,999);
        System.out.println(max(5,9));
    }
}
