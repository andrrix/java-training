package code._4_student_effort.challenge2_FooBarQuix;

import static java.lang.Math.pow;

public class Main {
    public static int digit(int x, int p) {
        return (int) (x / (pow(10, p))) % 10;
    }

    public static String compute(int x) {
        String sir = "";
        if (x % 3 == 0)
            sir += "Foo";
        if (x % 5 == 0)
            sir += "Bar";
        if (x % 7 == 0)
            sir += "Qix";
        int l = String.valueOf(x).length();
        l--;
        while (l >= 0) {
            int nr = digit(x, l);
            if (nr == 3)
                sir += "Foo";
            if (nr == 5)
                sir += "Bar";
            if (nr == 7)
                sir += "Qix";
            l--;
        }
        if (sir == "")
            return String.valueOf(x);
        return sir;
    }

    public static String compute2(int x) {
        String sir = "";
        boolean isdivide=false;
        if (x % 3 == 0)
            sir += "Foo";
        if (x % 5 == 0)
            sir += "Bar";
        if (x % 7 == 0)
            sir += "Qix";
        int l = String.valueOf(x).length();
        l--;
        while (l >= 0) {
            int nr = digit(x, l);
            if (nr == 0)
                sir += "*";
            else if (nr == 3)
                sir += "Foo";
            else if (nr == 5)
                sir += "Bar";
            else if (nr == 7)
                sir += "Qix";
            else sir+=String.valueOf(nr);
            l--;
        }
        if (sir == "")
            return String.valueOf(x);
        return sir;
    }

    public static void main(String[] args) {

        //System.out.println(+digit(1245, 2));
        System.out.println(compute2(53));
        System.out.println(compute2(101));

    }

}
