package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
int[] arr={1,2,3,12,4,89,35,8,67};
int target=67;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

//        loop
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
