package oops;
public class A5_Final_Keyword{
    public static class Student{
        String name;
        int rollno;
        double marks;
        final String schoolname = "DPS";
        public Student(){
            
        }

        public Student(String name,int rollno,double marks){
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
            
        }
    }

    public static void main(String[] args) {
       Student s1 = new Student("Abheyjeet",12,85);
       System.out.println(s1.schoolname);
       

}
}

