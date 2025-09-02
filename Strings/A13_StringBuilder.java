package Strings;

public class A13_StringBuilder {
    public static void main(String[] args) {
        String a = "Abheyjeet";
        StringBuilder s = new StringBuilder(a);//this will convery string a to String builder
        StringBuilder sa = new StringBuilder(10);//10 is capacity
        StringBuilder sb = new StringBuilder("");//empty string;and by default its capacity is 16
        System.out.println(s);
        System.out.println(s.reverse());//to reverse string
    }
}
