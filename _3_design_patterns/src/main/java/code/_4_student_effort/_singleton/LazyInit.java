package code._4_student_effort._singleton;

public class LazyInit {
    private static String name;
    private static LazyInit instance;

    private LazyInit() {
        instance.name="andrei";
    }
    public static String getInstance(){
        if(instance==null){
            instance = new LazyInit();
        }
        return instance.name;
    }

    public static void main(String[] args) {
        LazyInit instance = null;
        System.out.println(instance.getInstance());
    }
}
