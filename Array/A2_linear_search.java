package Array;

import java.util.Scanner;

public class A2_linear_search {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sr.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sr.nextInt();

        }
        System.out.println("Enter key: ");
        int key= sr.nextInt();
        int answer = -1;
        for(int i = 0;i<n;i++){
            if(arr[i]==key){
            answer = i;
            break;
        }
        }
        if(answer>-1) System.out.println("Key is on Index: "+answer);
        else System.out.println("Not found");


    }
    
}
