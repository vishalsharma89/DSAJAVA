package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int[]  arr = {1,3,5,5,5,5,5,67,123};
        System.out.println(searchRange(arr,5));

    }
         static int firstOcc(int[] arr,int key)
         {
             int s=0;
             int e = arr.length-1;
             int ans = -1;

             while(s<=e){
                 int mid = s+(e-s)/2;
                 if(arr[mid]==key){
                     ans = mid;
                     e=mid-1;
                 }else if(arr[mid]>key){
                     e=mid-1;
                 } else if (arr[mid]<key) {
                     s=mid+1;
                 }
             }
             return ans;
         }
    static int lastOcc(int[] arr,int key)
    {
        int s=0;
        int e = arr.length-1;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==key){
                ans = mid;
                s=mid+1;
            }else if(arr[mid]>key){
                e=mid-1;
            } else if (arr[mid]<key) {
                s=mid+1;
            }
        }
        return ans;
    }

    static int[] searchRange(int[] nums, int target){
        int[] num={-1,-1};
        num[0] = firstOcc(nums,target);
        num[1] = lastOcc(nums,target);

        return num;
    }
}
