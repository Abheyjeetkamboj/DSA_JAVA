package TwoD_Arrays;

import java.util.Scanner;

//write a program to store 4 students rollno and marks side by side
public class A4_Store_Marks {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[][] arr = new int[4][2];
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0;i<m;i++){
            System.out.println("Enter Student "+i);
            for(int j = 0;j<n;j++){
                arr[i][j]=sr.nextInt();
            }
        }
        System.out.println("Enter Student");
        int Student = sr.nextInt();
        System.out.print(arr[Student-1][1]);
        //         for(int i = 0;i<m;i++){
        //     for(int j = 0;j<n;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

    }
}
