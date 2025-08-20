package oops;

public class A7_Static_Function {
        public static class Student{
        String name;
        int rollno;
        double marks;
        static int numberofstudent;
        public Student(){
            
        }

        public Student(String name,int rollno,double marks){
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
            numberofstudent++;
        }
    }
    public static void main(String[] args) {
        System.out.println(Student.numberofstudent);//we can access this because only this keyword is static
    }
}
