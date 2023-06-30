package RecursionQuestions;

public class ProductOfDigits {
    public static void main(String[] args) {
        int sum = productOfDigit(54321);
        System.out.println(sum);
    }

    static int productOfDigit(int n){
        if(n%10==n){
            return n;
        }
        return productOfDigit(n/10)*(n%10);
    }
}
