package Recursion;

public class A16_Generate_Parentheses {
    public static void print(int start,int end,int n,String s){
        if(s.length()==n*2){
            System.out.println(s);
            return;
        }
        if(start<n)print(start+1, end, n, s+"(");
        if(end<start)print(start, end+1, n, s+")");
    }
    public static void main(String[] args) {
        int n=3;
        print(0,0,n,"");
    }
}
