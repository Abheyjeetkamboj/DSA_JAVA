package Strings;

public class A3_built_in {
    public static void main(String[] args) {
        String name = "Abheyjeet Kamboj";
        System.out.println(name);
        System.out.println(name.charAt(3));
        for(int i = 0;i<name.length();i++){
                    System.out.print(name.charAt(i)+" ");
        
                }
                System.out.println();




        System.out.println(name.indexOf('e'));//to find  index of char
        System.out.println(name.lastIndexOf('e'));//last occurence 
        

        String a = "aac";
        String b = "dbc";
        //compare two strings will compare a and b first char if same then it will goes on next one otherwise minus ascii values and return ans;
        System.out.println(a.compareTo(b));//97-100 return 3;



        //contains

        String hello = "hnji ki haal chaal dosto theek thak je";
        System.out.println(hello.contains("chaal"));
        System.out.println(hello.startsWith("hnji"));//is this string is starting with hnji
        System.out.println(hello.endsWith("je"));
    }  
    
    


}
