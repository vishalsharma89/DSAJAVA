package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {0,1,2},
                {18,19,20,21},
                {89,23,24}
        };
        int target = 21;
        int ans1 = max(arr);
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(ans1);

    }

    static int[] search(int[][] arr,int target){

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
