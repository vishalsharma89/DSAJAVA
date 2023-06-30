package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

//        list.add(67);
//        list.add(45);
//        list.add(145);
//        list.add(5);
//        list.add(4);
//        System.out.println(list);

//        input
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }

//        output
        for (int i=0;i<5;i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
