package BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {-5,-4,-3,-2,0,1,2,3,10,14};
        int ans = 7;
        System.out.println(binarySearch(arr,ans));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }

        }
        return arr[end];
    }
}
