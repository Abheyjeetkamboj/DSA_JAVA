package Strings;

public class A12_Equals {
    public static void main(String[] args) {
        String s = "Abheyjeet";
        String a = new String(s);
        String b = "Abheyjeet";
        System.out.println(s==a); //compares addresses in case of strings
        System.out.println(s==b);
        System.out.println(s.equals(a));//compares char by char
    }
}
