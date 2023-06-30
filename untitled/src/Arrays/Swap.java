package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,5,18};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
