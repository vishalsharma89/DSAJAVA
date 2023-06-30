package Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,3,23,500,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,3));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr,int a,int b){
        int maxVal = arr[0];
        for(int i=a;i<=b;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
