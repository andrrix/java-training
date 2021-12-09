package code._4_student_effort.challenge1_fizzbuzz;

public class Main {
    public static void main(String[] args) {
            int i;
            for(i=1;i<=100;i++)
            { if(i%15==0)
                System.out.print("FizzBuzz, ");
                else if(i%3==0)
                        System.out.print("Fizz, ");
                      else if(i%5==0)
                          System.out.print("Buzz, ");
                           else if(i%7==0)
                               System.out.print("Rizz, ");
                           else if(i%11==0)
                               System.out.print("Jazz, ");
                      else System.out.print(+ i + ", ");

            }
    }
}
