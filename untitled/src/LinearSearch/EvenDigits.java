package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
    int[] nums = {12,234,3,2,2342,4561};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
int numOfDigits = digits(num);
return numOfDigits%2==0;
    }
    static int digits(int num){
        if(num <0){
            num =num*-1;
        }
        if(num ==0){
            num=1;
        }
        int count = 0;
        while(num>0){
            count++;
            num =num/10;
        }
        return count;
    }
}
