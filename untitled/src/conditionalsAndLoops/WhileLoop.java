package conditionalsAndLoops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        Print 1 to n
        while(n<5){
            System.out.println("Hello World "+n);
            n++;
        }
    }
}
