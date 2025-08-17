package Array;

import java.util.Scanner;

public class A3_passing_arrays_to_Methods {
    public static int add(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sr = new Scanner(System.in);
        for(int i =0 ;i<8;i++){
            arr[i] = sr.nextInt();
        }
        System.out.println(add(arr));
    }
}
