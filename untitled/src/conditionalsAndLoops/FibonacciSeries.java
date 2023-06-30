package conditionalsAndLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first = 0;
        int second = 1;
        int count=2;

        while(count<=n){
            int temp = second;
            second = first+second;
            first = temp;
            count++;
        }
        System.out.println(second);

    }
}
