package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {6,2,34,5,6,6,7,7,7,7};
//        int target = 5;
        System.out.println(SearchInRange(arr));
    }

    static int SearchInRange(int[] arr){
        int min = arr[0];
        if(arr.length==0){
            return -1;
        }
        for(int i=1;i<arr.length;i++){
            if( arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
