package Recursion;

public class A15_Binary_String {
    public static void print(int n,String ans) {
        int m = ans.length();
        if(n==m){
            System.out.println(ans);
            return;
        }
        if(m==0||ans.charAt(m-1)=='0'){
            print(n,ans+0);
            print(n,ans+1);
        }
        else{
            print(n, ans+0);
        }
        
    }
    public static void main(String[] args) {
        int n = 3;
        print(n,"");
      
    }
}
