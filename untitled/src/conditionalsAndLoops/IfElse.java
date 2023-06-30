package conditionalsAndLoops;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if(n==0){
            System.out.println("it is zero");
        }
        else if(n==1){
            System.out.println("Greater than zero");
        }
        else {
            System.out.println("Greater than 1");
        }
    }
}
