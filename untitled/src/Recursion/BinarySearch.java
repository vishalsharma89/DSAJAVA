package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
int[] arr = {1,2,3,4,7,34,54,55};
int target = 4;
        System.out.println(Bs(arr,target,0,arr.length-1));
    }

    static int Bs(int[] arr,int target,int s, int e){

        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return Bs(arr,target,s,mid-1);
        }
        return Bs(arr,target,mid+1,e);

    }
}
