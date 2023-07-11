package RecursionQuestions;

public class ArraySortedOrNot {
    public static void main(String[] args) {
int[] arr = {20,21,41,89,9};
        System.out.println(isSorted(arr,arr.length-1));
        System.out.println(isSortedI(arr,arr.length-1));
    }

//    USing Recursion
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

//    Using Iteration
    public static boolean isSortedI(int[] arr,int n){
//        base condition
        if(n==0 || n==1){
            return true;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
