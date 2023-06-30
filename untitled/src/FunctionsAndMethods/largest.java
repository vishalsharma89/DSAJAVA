package FunctionsAndMethods;

public class largest {
    public static void main(String[] args) {
        int a =10;
        int b =100;
        int c = 50;
        System.out.println(largest(a,b,c));

    }
    static int largest(int a,int b,int c){
        int max = a;
        if(b>c){
            max = b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}
