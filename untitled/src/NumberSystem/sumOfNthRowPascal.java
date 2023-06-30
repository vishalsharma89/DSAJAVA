package NumberSystem;

public class sumOfNthRowPascal {
    public static void main(String[] args) {
        int n=10;

        System.out.println(Sum(n));
    }
    static long Sum(int n){
        long sum = 0;
        sum = 1<<n;

        return (sum-1);
    }
}
