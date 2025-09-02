package Strings;

public class A15_Toggle {
    public static void main(String[] args) {
        String a = "AbHeYJeet";
        StringBuilder ans = new StringBuilder(a);
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            int asc = (int)ch;
            if(ch>=90){
                asc = asc-32;
                ch = (char)asc;
                ans.setCharAt(i, ch);
            }
            else{
                asc = asc+32;
                
                ch = (char)asc;
                ans.setCharAt(i, ch);
            }
        }
        System.out.println(ans);
    }
}
