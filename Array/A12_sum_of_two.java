package Array;

import java.util.ArrayList;

public class A12_sum_of_two {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,1,2,5,6,2,7,8,3} ;
    int sum = 5;
    ArrayList <Integer> ans= new ArrayList<>();
    boolean a = false;
    for(int i = 0;i<arr.length;i++){
        for(int j= i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==sum){
                ans.add(arr[i]);
                ans.add(arr[j]);
                a = true;
                break;
            }
            if(a) break;
        }
    }
    System.out.println(ans);
    }
    

}
