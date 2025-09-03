package Strings;

public class A20_Delete_Insert {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder("abcdef");
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2, 6);
        System.out.println(sb);
        sb.insert(2, 'j');
        System.out.println(sb);
        sb.insert(3, "hello");
        System.out.println(sb);
        sb.insert(3, 2);
        System.out.println(sb);
    }
}
