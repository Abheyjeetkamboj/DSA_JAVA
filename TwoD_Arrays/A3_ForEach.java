package TwoD_Arrays;

public class A3_ForEach {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6}} ;
        //to print this with for each loop
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
