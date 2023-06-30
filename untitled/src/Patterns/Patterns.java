package Patterns;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
pattern1(4);
        System.out.println("Pattern 2");
pattern2(4);
System.out.println("Pattern 3");
pattern3(4);
System.out.println("Pattern 4");
pattern4(4);
System.out.println("Pattern 5");
pattern5(4);

    }

    static void pattern1(int n){
        for(int row=1;row<=n;row++){
//            for every row run the col
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
//            for every row run the col
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++){
//            for every row run the col
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    static void pattern4(int n){
        for(int row=1;row<=n;row++){
//            for every row run the col
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
//            for every row run the col
            int totalcol = row>n?2*n-row:row;
            for(int col=0;col<totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
