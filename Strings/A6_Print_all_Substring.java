package Strings;

import java.util.Scanner;

public class A6_Print_all_Substring {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String s= sr.next();
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }

    }
}