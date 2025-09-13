package Recursion;

public class A7_Pre_in_post {
    public static void pip(int n){
        if(n==0) return;
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
         int n  = 3;
         pip(n);
    }
}
