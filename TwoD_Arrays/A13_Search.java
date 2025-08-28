package TwoD_Arrays;

import java.util.Scanner;

public class A13_Search {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int target = sr.nextInt();
        int[][] arr=  {{1,2,3},{4,5,6},{7,8,9}};
        boolean flag = true;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                     System.out.println("True");
                     flag = false;
                     break;
            }
            }
        }
        if(flag = true){
        System.out.println("False");
        }
    }
}
