package Strings;
class A16_Append{
    public static void main(String[] args) {
        StringBuilder s  = new StringBuilder();
        s.append("Abc");
        System.out.println(s);
        s.append("Def");
        System.out.println(s);
        s.append(38);
        System.out.println(s);

        char[] ch = {'h','e','l','l','o'};
        s.append(ch);
        System.out.println(s);
        // int[] arr= {1,2,3,5};
        // s.append(arr);//does not works but address of this array will be appended;
        // System.out.println(s);


        StringBuilder t  = new StringBuilder("This");
        s.append(t);
        System.out.println(s);
        // s+= "Abc";//this will not works
    }
}