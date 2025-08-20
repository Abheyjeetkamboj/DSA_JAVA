
package TwoD_Arrays;

import java.util.Scanner;
public class A1_two_dimension_array {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        Scanner sr = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                grid[i][j]=sr.nextInt();
            }
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
