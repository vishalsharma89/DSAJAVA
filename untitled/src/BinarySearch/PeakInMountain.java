package BinarySearch;

public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,15,2};
        System.out.println(linearBinary(arr));

    }

    static int linearBinary(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else {
                e=mid;
            }
        }
        return s;
    }
}
