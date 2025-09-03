package Strings;

import java.util.Arrays;

public class A19_Sort_Character_Array {
    public static void main(String[] args) {
        String s = "Abheyjeet";
        char[] ch = s.toCharArray();
        for(char ele:ch){
            System.out.print(ele);
        }
    System.out.println();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        }
    }
}
