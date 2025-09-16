package Recursion;

import java.util.ArrayList;

public class A12_Subsets {
    public static void print(int i,String s ,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char n = s.charAt(i);
        print(i+1,s,ans);
        print(i+1,s,ans+n);
    }

    public static void main(String[] args) {
        String s = "ABC";
        print(0,s,"");
    }
}
