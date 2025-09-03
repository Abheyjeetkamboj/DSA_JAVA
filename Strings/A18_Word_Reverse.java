package Strings;

import java.util.Scanner;

public class A18_Word_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int i = 0;
        int j= 0;
        while(j<n){
            if(sb.charAt(j)!=' ') j++;
            else{
                reverse(sb, i, j-1);
                i = j+1;
                if(sb.charAt(i)==' '){
                for(int a = i;a<n;a++){
                    if(sb.charAt(a)!=' '){ 
                        i = a;
                        break;
                    }
                }
                }
                j = i;
            }
        }
        reverse(sb, i, j-1);
        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb,int i,int j){
        while(i<=j){
            char ch = sb.charAt(i); 
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;

        }
    }
}
