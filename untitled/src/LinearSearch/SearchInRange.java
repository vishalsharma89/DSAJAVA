package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,6,6,7,7,7,7};
        int target = 5;
        System.out.println(SearchInRange(arr,target,1,4));
    }

    static int SearchInRange(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
