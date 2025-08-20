package Array;

import java.util.ArrayList;

public class A11_Array_list {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(6);
    arr.add(0,10);
    arr.add(1,20);
    arr.add(2,30);
    arr.add(3,40);
    arr.add(4,50);
    arr.add(60);//this will add this value from back side of array;
    System.out.println(arr.size());

    System.out.println(arr.get(0));
    System.out.println(arr);
    arr.add(90);
    System.out.println(arr.size());
    System.out.println(arr);
    }

}
