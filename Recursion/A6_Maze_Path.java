package Recursion;

import java.util.Scanner;

public class A6_Maze_Path {
    public static int maze(int i,int j,int m,int n){
        // if(i==m||j==n) return 1;
        if(i==m&&j==n)return 1;
        if(i>m||j>n)return 0;
        int col = maze(i,j+1,m,n);
        int row = maze(i+1,j,m,n);
        return col+row;
    }
    
    
    public static int maze1(int m,int n){
        if(m==1||n==1) return 1;
        
        int col = maze1(m,n-1);
        int row = maze1(m-1,n);
        return col+row;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in); 
        int n = sr.nextInt();
        int m = sr.nextInt();
        System.out.println(maze(1,1,m,n));
        System.out.println(maze1(m,n));

    }
}
