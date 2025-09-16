package Recursion;

public class A11_Skip_Char {
    public static void print(int i,String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a'&&s.charAt(i)!='A'){
            ans+=s.charAt(i);
        }
        print(i+1, s, ans);
    }
    public static void main(String[] args) {
        String s = "Abheyjeet Kamboj";
        print(0, s, "");
    }
}
