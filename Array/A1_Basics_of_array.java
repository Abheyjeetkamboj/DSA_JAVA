package Array;


import java.util.Scanner;

public class A1_Basics_of_array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {1,2,34,5,5,7};
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
        
        for(int i = 0;i<5;i++){
            Scanner sr = new Scanner(System.in);
            arr[i] = sr.nextInt();
        }
        
        for(int i = 0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
