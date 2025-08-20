package TwoD_Arrays;

public class A5_Largest_Element {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{9,7,5},{3,2,6}};
        int mini = -28424;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mini<arr[i][j]) mini = arr[i][j];
            }
        }
        System.out.println(mini);
    }
}
