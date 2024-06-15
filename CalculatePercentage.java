abstract class Marks {
    abstract void getPercentage();
}

class A extends Marks {
    int s1, s2, s3;
    int obt_Marks;
    int Total_Marks = 300;
    double percentage;

    public A(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void getPercentage() {
        obt_Marks = s1 + s2 + s3;
        percentage = ((double)obt_Marks / Total_Marks) * 100;
        System.out.println("Percentage of Student A is : " + percentage);
    }
}

class B extends Marks {
    int s4, s5, s6, s7;
    int obt_Marks;
    int Total_Marks = 400;
    double per;

    public B(int s4, int s5, int s6, int s7) {
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
    }

    public void getPercentage() {
        obt_Marks = s4 + s5 + s6 + s7;
        per = ((double)obt_Marks / Total_Marks) * 100;
        System.out.println("Percentage of Student B is : " + per);
    }
}

class CalculatePercentage {
    public static void main(String args[]) {
        A a = new A(67, 85, 97);
        a.getPercentage();

        B b = new B(75, 95, 84, 76);
        b.getPercentage();

    }
}
