package Recursion;

public class A10_Skip_Char {
    public static void print(int i ,String s){
        if(i==s.length()) return;
        if(s.charAt(i)=='E'||s.charAt(i)=='e'){
            print(i+1, s);
            return;
        }
        System.out.print(s.charAt(i));
        print(i+1, s);
        
    }
    public static void main(String[] args) {
        String name = "Abheyjeet";
        print(0,name);
    }
}
