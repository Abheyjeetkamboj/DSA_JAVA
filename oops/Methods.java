package oops;
import java.util.Scanner; 
public class Methods {
    static int add(int x,int y){
        return x+y;
    }
    static void greet(){
        System.out.println("Hello, How are you");
    }
    public static void main(String[] args) {
        greet();
        Scanner sr = new Scanner(System.in);
        Scanner sr1 = new Scanner(System.in);
        int x = sr.nextInt();
        int y = sr.nextInt();
        System.out.println(add(x,y));

    }
}
