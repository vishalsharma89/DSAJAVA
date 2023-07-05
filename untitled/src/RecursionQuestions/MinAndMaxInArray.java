package RecursionQuestions;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;

        // Function calling
        System.out.println(min(A, n));
        System.out.println(max(A, n));
        findMinMax(A,n);

    }

    static int min(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],min(arr,n-1));
    }
    static int max(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],max(arr,n-1));
    }

    static void findMinMax(int[] arr,int n){
        if(arr==null || n==0){
            System.out.println("Array Empty");
        }
        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Minimum : "+min);
        System.out.println("Maximum : "+max);
    }
}
