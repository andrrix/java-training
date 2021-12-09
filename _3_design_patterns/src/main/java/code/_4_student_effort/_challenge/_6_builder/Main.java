package code._4_student_effort._challenge._6_builder;

import code._2_challenge._6_builder.Person;

public class Main {
    public static void main(String[] args) {
       Person person01 = new Person.Builder("Asavescu")
               .job("java developer")
               .build();

        Person person02 = new Person.Builder("Dana")
                .isMarried(false)
                .build();
        System.out.println(person01);
        System.out.println(person02);
    }
}
