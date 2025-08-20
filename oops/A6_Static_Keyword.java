package oops;
public class A6_Static_Keyword{
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
       Student s1 = new Student("Abheyjeet",12,85);
       System.out.println(s1.numberofstudent);
       Student s2 = new Student("Rohan ",13,29.4);
       System.out.println(s2.numberofstudent);
       Student s3 = new Student("hello",21,84);
       System.out.println(s1.numberofstudent);
       System.out.println(s2.numberofstudent);
       System.out.println(s3.numberofstudent);
       

}
}