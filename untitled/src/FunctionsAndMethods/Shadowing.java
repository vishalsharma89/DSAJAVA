package FunctionsAndMethods;

public class Shadowing {
    static  int x = 90;
    public static void main(String[] args) {
        System.out.println(x);//90
        x = 50;
        System.out.println(x);//50
    }
}
