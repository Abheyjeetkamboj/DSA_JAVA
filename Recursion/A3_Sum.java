package Recursion;

import java.util.Scanner;

public class A3_Sum {
    public static int sum(int x){
        if(x==0)  return 0;
        return x+sum(x-1);
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        System.out.println(sum(n));
    }
}
