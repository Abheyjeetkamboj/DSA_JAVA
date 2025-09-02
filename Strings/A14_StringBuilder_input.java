package Strings;

import java.util.Scanner;

public class A14_StringBuilder_input {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        
        String s = sr.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

        //another way
        System.out.print("Enter input:");
        StringBuilder hello = new StringBuilder(sr.nextLine());
        System.out.println(hello);
 


        //change value 

        StringBuilder a = new StringBuilder(sr.nextLine());
        a.setCharAt(1, 'a'); // this will set value of 1 index to 'a';
        System.out.println(a);
    }
}
