package RecursionQuestions;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = sumOfDigit(54321);
        System.out.println(sum);
    }

    static int sumOf(int n){
        int sum=0;
        int number = n;
        while(n!=0){
            int digit = n%10;// Extract the last digit
            sum+=digit;// Add the digit to the sum
            n/=10;// Remove the last digit
        }
        return sum;
    }
    static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return sumOfDigit(n/10)+(n%10);
    }
}
