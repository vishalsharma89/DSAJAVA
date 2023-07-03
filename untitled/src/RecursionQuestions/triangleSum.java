package RecursionQuestions;

//Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level.
//        Example :
//
//
//        Input : A = {1, 2, 3, 4, 5}
//        Output : [48]
//        [20, 28]
//        [8, 12, 16]
//        [3, 5, 7, 9]
//        [1, 2, 3, 4, 5]

import java.util.Arrays;

public class triangleSum {
    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);

    }

    // Function to generate Special Triangle.
    public static void printTriangle(int[] arr)
    {
        // Base case
        if (arr.length < 1)
            return;

        // Creating new array which contains the
        // Sum of consecutive elements in
        // the array passes as parameter.
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++)
        {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }

        // Make a recursive call and pass
        // the newly created array
        printTriangle(temp);

        // Print current array in the end so
        // that smaller arrays are printed first
        System.out.println(Arrays.toString(arr));
    }
}
