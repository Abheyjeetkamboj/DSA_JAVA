package Strings;

public class A22_Maximum_in_string {
    public static void main(String[] args) {
        String[] s = {"96","0000047","00000","00546","69"};
        String maxi = s[0];
        for(int  i = 0;i<s.length;i++){
            maxi = max(maxi,s[i]);
        }
        System.out.println(maxi);
    }
    public static String max(String a,String b){
        String x = purify(a),y = purify(b);
        if(x.length()>y.length()) return a;
        if(x.length()<y.length()) return b;
        for(int i = 0;i<x.length();i++){
            if(x.charAt(i)!=y.charAt(i)){
                if(x.charAt(i)>y.charAt(i)) return a;
                else return b;
            }
        }
        if(x.length()>=y.length()) return a;
        else return b;
        
    }
    public static String purify(String a){
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)!='0') return a.substring(i);
        }
        String x = ""+a.charAt(1);
        return x;
    }
}
