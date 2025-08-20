package oops;

public class A3_Getter_and_setter {
    public static class Student{
        String name;
        private int rno;
        double percentage;

        public int getrno(){
            return rno;
        }
        public void setrno(int rollno){
            rno = rollno;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setrno(12);
        System.out.println(s1.getrno());
    }
}
