package NumberSystem;

public class findDuplicates {
    public static void main(String[] args) {
int[] arr = {2,3,3,4,2,6,4};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr){
        int ans=0;
        for (int i:arr){
            ans^=i;
               }
        return ans;
        }
}

