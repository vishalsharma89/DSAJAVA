package RecursionQuestions;

public class ArraySortedOrNot {
    public static void main(String[] args) {
int[] arr = {20,21,451,89,91};
        System.out.println(isSorted(arr,arr.length-1));
    }

    public static boolean isSorted(int[] arr,int n){
//        base condition
        if(n==0 || n==1){
            return true;
        }
        if(arr[n-2]>arr[n-1]){
            return false;
        }
        return isSorted(arr,n-1);
    }
}
