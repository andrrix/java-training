package code._4_student_effort._challenge._2_strategy;

import java.util.Arrays;

public class Main {
        public static void displaySorted(SortingStrategy s, Integer[] arr){
            s.sort(arr);
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i] +" ");

            System.out.println();
        }
    public static void main(String[] args) {
        Integer[] arr= new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] arr1= Arrays.copyOf(arr,arr.length);
        Integer[] arr2= Arrays.copyOf(arr,arr.length);

        displaySorted(new BubbleSort(), arr1);
        displaySorted(new MergeSort(), arr2);
    }
}
