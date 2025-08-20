package oops;



public class A8_Fraction {


    public static Fraction add (Fraction f1,Fraction f2){
            int numerator = f1.num*f2.den + f2.num*f1.den;
            int denomitor = f1.den*f2.den;
            Fraction f3 = new Fraction(numerator, denomitor);
            return f3;
    }


    public static Fraction add2 (Fraction f1,Fraction f2){
            int numerator = f1.num*f2.den + f2.num*f1.den;
            int denomitor = f1.den*f2.den;
            f1 = new Fraction(numerator, denomitor);
            return f1;
    }


    public static Fraction sub (Fraction f1,Fraction f2){
            int numerator = f1.num*f2.den - f2.num*f1.den;
            int denomitor = f1.den*f2.den;
            Fraction f3 = new Fraction(numerator, denomitor);
            return f3;
    }


    public static Fraction mul (Fraction f1,Fraction f2){
            int numerator = f1.num*f2.num;
            int denomitor = f1.den*f2.den;
            Fraction f3 = new Fraction(numerator, denomitor);
            return f3;
    }


    public static int gcd (int num,int den) {
        int mini = Math.min(num, den);
        for(int i = mini;i>=1;i++){
            if(num%i==0&&den%i==0) return i;
        }
        return 1;   
    }
    public static class Fraction {
            int num;
            int den;
            public Fraction(int num,int den){
                this.num  = num;
                this.den = den;
                simplyfy();
            }
            public void simplyfy(){
                int hcf = gcd(num,den);
                num /=hcf;
                den/=hcf;
            }

            public  void add2 (Fraction f2){
                this.num= this.num*f2.den + f2.num*this.den;
                this.den= this.num*f2.den;
                simplyfy();
    }
        
    }
    public static void main(String[] args) {
        // Fraction f1 = new Fraction(12, 24);
        // System.out.println(f1.num+"/"+f1.den);
        // f1.simplyfy();
        // System.out.println(f1.num+"/"+f1.den);
        System.out.println("Adding");
        Fraction f1 = new Fraction(35, 21);
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2 = new Fraction(7, 3);
        System.out.println(f2.num+"/"+f2.den);
        f1.add2(f2);
        System.out.println(f1.num+"/"+f1.den);
        System.out.println(f1.num+"/"+f1.den);
        
        
        // System.out.println("Multiply");
        // Fraction m1 = new Fraction(35, 21);
        // System.out.println(m1.num+"/"+m1.den);
        // Fraction m2 = new Fraction(7, 3);
        // System.out.println(m2.num+"/"+m2.den);
        // Fraction m3 = mul(m1,m2);
        // System.out.println(m3.num+"/"+m3.den);
        

        // System.out.println("Subtraction");
        // Fraction s1 = new Fraction(35, 21);
        // System.out.println(s1.num+"/"+s1.den);
        // Fraction s2 = new Fraction(7, 3);
        // System.out.println(s2.num+"/"+s2.den);
        // Fraction s3 = sub(s1,m2);
        // System.out.println(s3.num+"/"+s3.den);
    }
}
