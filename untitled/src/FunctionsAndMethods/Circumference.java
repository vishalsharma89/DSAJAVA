package FunctionsAndMethods;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println(CircleCircum(radius));
    }
    static double CircleCircum(int r){
        return 2*3.14*r;
    }
}
