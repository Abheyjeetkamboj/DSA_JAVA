package Strings;

public class A11_Update_even_position {
    public static void main(String[] args) {
        String s = "Hanji Ki Haal Chal Dosto Theek Thak Je";
        
        String hello = "";
        for(int i = 0;i<s.length();i++){
            if(i%2==0){
                hello = hello+'a';
            }
            else{
                hello = hello+s.charAt(i);
            }
        }
        System.out.println(hello);
    }
}
