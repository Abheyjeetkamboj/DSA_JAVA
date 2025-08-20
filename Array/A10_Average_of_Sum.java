package Array;

public class A10_Average_of_Sum {
    public static void main(String[] args) {
        int[] arr = {98,100,91,87,96};
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        double Average_of_Sum=(double)sum/arr.length;
        
        System.out.println(sum);
        System.out.println(Average_of_Sum);
    }
}
