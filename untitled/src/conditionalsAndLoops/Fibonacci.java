package conditionalsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = 0;
        int second = 1;
//        int c;
        int count = in.nextInt();

        for(int i = 1;i<=count;i++){
            System.out.print(first+ " ");
           int next = first+second;
            first=second;
            second=next;

        }

    }
}
