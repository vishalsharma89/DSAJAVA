package RecursionQuestions;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,16,7};
        System.out.println(linear(arr,3,0));
        System.out.println(linearIndex(arr,3,0));

    }

    static boolean linear(int[] arr, int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || linear(arr,target,index+1);
    }static int linearIndex(int[] arr, int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target ){
            return index;
        }
        return linearIndex(arr,target,index+1);
    }
}

