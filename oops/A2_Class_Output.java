package oops;
public class A2_Class_Output {
    // class is in Student.java


    static void print(Student x){
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.marks);
    }
    public static void main(String[] args) {
       Student x = new Student();
       x.name = "Abheyjeet";
       x.rollno = 12;
    //    System.out.println(x.name);
    //    System.out.println(x.rollno);
    print(x);
    }
}

