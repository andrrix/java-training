package code._4_student_effort;

import java.lang.String;
import java.text.DecimalFormat;

public class toVerifySomething {
    public static char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
    public static char[] copyTo = new char[7];

    static public void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
    }

    public static void main(String[] args) {
//        System.arraycopy(copyFrom, 2, copyTo ,0,7);
//        System.out.println(new String(copyTo));
//        char [] copyTo2 = java.util.Arrays.copyOfRange(copyFrom,2,9);
        //System.out.println(new String(copyTo2));
//        String a1="andrei";
//        String a2="andrei";
//        System.out.println(a1.equals(a2));
//        Integer ab=2;
//        Integer ba=2;
//        Integer abc=202;
//        Integer cba=202;
//        System.out.println(ab==ba);
//        System.out.println(ab.equals(ba));
//        System.out.println(abc==cba);
//        System.out.println(abc.equals(cba));
//          int[] numbers ={1,2,3,4,5,6,7,8,9,10};
//          for (int item: numbers){
//              System.out.println("%nCount is: \n%n" +  item);
//          }


//    }
//        customFormat("###,###.###", 123456.789);
//        customFormat("###.##", 123456.789);
//        customFormat("000000.000", 123.78);
//        customFormat("$###,###.###", 12345.67);
        String s= "JAVA";
        s.concat(" CODE");
        System.out.println(s);
    }
}