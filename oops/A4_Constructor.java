package oops;

public class A4_Constructor {
    public static class Student{
        String name;
        int rollno;
        double percentage;
        public Student(){
            //default constructor
        }

        public Student(String name,int rollno,double percentage){
            this.name = name;
            this.rollno = rollno;
            this.percentage = percentage;
        }
    }
    public static void print(Student x){
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.percentage);
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1 = new Student("Abheyjeet",12,85);
        print(s1);
        Student s2 = new Student("Aseem", 8, 90.23);
        print(s2);
    }
}
