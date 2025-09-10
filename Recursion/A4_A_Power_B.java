package Recursion;

import java.util.Scanner;

public class A4_A_Power_B {
    public static int power(int a,int b){
        if(b==0) return 1;
        int ans = power(a,b/2);
       
        if(b%2==0) return ans*ans;
        else return a*ans*ans;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a,b;
        a = sr.nextInt();
        b = sr.nextInt();
        
        System.out.println(power(a,b));
    }
}
