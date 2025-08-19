package Array;

import java.util.Arrays;

public class A5_Copy{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int [] copyarr = arr;//shallow copy
        copyarr[0] = 70;
        System.out.println(arr[0]);
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 60;
        System.out.println(arr[0]);
        //second way 
        int[] crr = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            crr[i]=arr[i];
        }
        for(int ele:crr){
            System.out.print(ele);
        }
    }
}
