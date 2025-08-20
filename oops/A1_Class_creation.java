package oops;
public class A1_Class_creation {
    public static class Student{
        String name;
        int rollno;
        double marks;
    }
    public static void main(String[] args) {
       Student x = new Student();
       x.name = "Abheyjeet";
       x.rollno = 12;
       System.out.println(x.name);
       System.out.println(x.rollno);
    }
}
