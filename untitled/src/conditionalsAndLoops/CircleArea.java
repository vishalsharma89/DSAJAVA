package conditionalsAndLoops;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double area = pi*radius*radius;
        System.out.println(area);
    }
}
