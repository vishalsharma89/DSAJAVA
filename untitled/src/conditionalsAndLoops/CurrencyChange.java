package conditionalsAndLoops;

import java.util.Scanner;

public class CurrencyChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amount in rupee: ");
        int rupee = in.nextInt();
        double dollar = rupee*0.012;
        System.out.print("The Amount in dollar is: "+dollar+"USD");
//        System.out.print(dollar);
    }
}
