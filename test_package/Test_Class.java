package test_package;

public class Test_Class {
    public double d;
    int t;
    protected String str;
    private int s;

    public void setD(double d) {
        this.d = d;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getS(int t) {
        return s;
    }

    public int getT(int t) {
        return t;
    }


    public double getD(double d) {
        return d;
    }
}

class second {
    public static void main(String[] args) {
        Test_Class test = new Test_Class();
        test.str = "idk";
        test.setS(1);
        System.out.println(test.str + " " + test.getS(1));
        test.str = "idk";
        test.setT(3);
        System.out.println(test.str + " " + test.getT(4));
        test.str = "idk";
        test.setD(4);
        System.out.println(test.str + " " + test.getD(0.818933027098955175));

    }
}