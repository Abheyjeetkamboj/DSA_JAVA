package TwoD_Arrays;
import java.util.ArrayList;
import java.util.List;
public class A11_2D_Arraylist {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d= new ArrayList<>();
        d.add(60);

        List<List<Integer>> v = new ArrayList<>();
        v.add(a); v.add(b); v.add(c); v.add(d);


        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.get(i).size(); j++) {
                System.out.print(v.get(i).get(j)+" ");
            }
            System.out.println();
        }
        // System.out.println(v.get(1).get(1));


        // for(int i = 0;i<v.size();i++){
        //     System.out.println(v.get(i));
        // }


        // System.out.println(v);

    }
}
