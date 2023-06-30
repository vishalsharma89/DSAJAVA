package conditionalsAndLoops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int num=0;num<n;num++){
            System.out.println("Hello World "+(num+1));
        }
    }
}
