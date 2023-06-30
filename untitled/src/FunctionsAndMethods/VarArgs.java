package FunctionsAndMethods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func("kalu","bhalu","lalu");
    }
    static void func(String ...a){
        System.out.println(Arrays.toString(a));

    }
}
