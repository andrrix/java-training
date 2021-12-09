package code._4_student_effort._challenge._3_proxy;

import java.util.Arrays;

public class TheRealEstateAgentProxy {
    private Apartament[] apartaments= new Apartament[0];

    public void represent(Apartament apartament) {
       this.apartaments= Arrays.copyOf(this.apartaments,this.apartaments.length +1);
       this.apartaments[apartaments.length-1]=apartament;
    }

    public Apartament rent(Student student) {
        Apartament a=null;
        if (!student.getName().startsWith("P")) {
            for (int i=0;i< this.apartaments.length;i++) {
                if (this.apartaments[i].getMonthlyRentCost() < student.getMoney()) {
                    int index=i;
                    a=this.apartaments[i];
                    System.arraycopy(this.apartaments, index+1, this.apartaments, index, this.apartaments.length -1 - index);

                }
            }

        }
        return a;
    }
}
