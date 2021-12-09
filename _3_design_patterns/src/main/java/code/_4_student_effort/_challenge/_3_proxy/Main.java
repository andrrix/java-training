package code._4_student_effort._challenge._3_proxy;

public class Main {
    public static void main(String[] args) {
        Apartament ap1= new Apartament("Zorilor", 400);
        Apartament ap2= new Apartament("Marasti", 390);
        Apartament ap3= new Apartament("Manastur", 450);
        Apartament ap4= new Apartament("Someseni", 600);
        Apartament ap5= new Apartament("Gara", 250);

        TheRealEstateAgentProxy proxy= new TheRealEstateAgentProxy();
        proxy.represent(ap1);
        proxy.represent(ap2);
        proxy.represent(ap3);
        proxy.represent(ap4);
        proxy.represent(ap5);

        Student student1= new Student("Asavei", 300);
        Student student2=new Student("Popa", 400);

        Apartament apartamentForStudent1= proxy.rent(student1);
        System.out.println(student1 + "a inchiriat " + apartamentForStudent1);
        Apartament apartamentForStudent2= proxy.rent(student2);
        System.out.println(student2+ " a inchiriat " + apartamentForStudent2);

    }
}
