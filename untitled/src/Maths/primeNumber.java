package Maths;

public class primeNumber {
    public static void main(String[] args) {
        int n=20;
        for(int i=1;i<=n;i++){
            System.out.println(i+" "+prime(i));
        }
    }

    static boolean prime(int n){
  if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
