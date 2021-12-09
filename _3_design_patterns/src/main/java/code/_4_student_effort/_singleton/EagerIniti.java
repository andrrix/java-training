package code._4_student_effort._singleton;

public class EagerIniti {
    private static String name;
    private static final EagerIniti instance =new EagerIniti();

    private EagerIniti(){
        this.name="andreo";
    }



    public static String getInstance(){
        return instance.name;
    }

    public static void main(String[] args) {
        EagerIniti initi= new EagerIniti();
        System.out.println(EagerIniti.getInstance());
    }
}
