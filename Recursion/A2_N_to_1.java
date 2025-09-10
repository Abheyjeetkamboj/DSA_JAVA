package Recursion;

import java.util.Scanner;

public class A2_N_to_1 {
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);

    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        int n = sr.nextInt();
        print(n);

    }
}
