package code._4_student_effort._challenge._5_template_method;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] ar1= Arrays.copyOf(arr,arr.length);
        Integer[] ar2= Arrays.copyOf(arr,arr.length);

        AscBubbleSort asc= new AscBubbleSort();
        asc.sort(ar1);

        DescBubbleSort desc=new DescBubbleSort();
        desc.sort(ar2);

        displaySorted(ar1);
        displaySorted(ar2);
    }

    public static void displaySorted(Integer[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
