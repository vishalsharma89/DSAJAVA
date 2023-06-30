package FunctionsAndMethods;

import java.util.Scanner;

public class ProductFunc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Product(a,b));
    }

    static int Product(int a,int b){
        return a*b;
    }
}

