package Strings;

import java.util.Scanner;

public class A17_reverse_Stringbuilder {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sr.nextLine());
        int i = 0;
        int j = sb.length()-1;
        while(i<=j){
            char ch = sb.charAt(i); 
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;

        }
        System.out.println(sb);
        System.out.println(sb.reverse());//inbuilt function;
    }
}
