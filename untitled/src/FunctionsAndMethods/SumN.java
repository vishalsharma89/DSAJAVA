package FunctionsAndMethods;

public class SumN {
    public static void main(String[] args) {

        System.out.println(SumNatural(6));
    }

    static int SumNatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
