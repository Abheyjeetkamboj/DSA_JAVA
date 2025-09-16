package Recursion;

public class A9_String_Traversal {
    public static void print(int i,String name){
        if(i==name.length()) return;
        System.out.print(name.charAt(i));
        print(i+1, name);
    }
    public static void main(String[] args) {
        String name = "Abheyjeet Kamboj";
        print(0,name);
    }
}
