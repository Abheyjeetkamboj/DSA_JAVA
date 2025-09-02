package Strings;

public class A10_interning_new_keyword {
    public static void main(String[] args) {
        String a = "Abheyjeet";
        String b = "Abheyjeet";//points to abheyjeet
        String c = new String("Abheyjeet");//allocate new memory
        
    }
}
