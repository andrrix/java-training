package code._3_in_class;

public class Main {

    public static void main(String[] args) {
        try{
            System.out.println(7/0);
        } catch(ArithmeticException e){
            System.out.println("oops - ceva nu a mers bine:(");
        }
    }
}