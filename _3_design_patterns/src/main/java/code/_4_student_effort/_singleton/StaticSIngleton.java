package code._4_student_effort._singleton;

public class StaticSIngleton {
    private static String name;
    private static final StaticSIngleton instance;

    private StaticSIngleton(){
       // this.name="andreo";
    }
    static {
        try{
            instance = new StaticSIngleton();
        }
        catch(Exception e ){
            throw new RuntimeException("m");
        }
    }
    public static StaticSIngleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        StaticSIngleton initi= new StaticSIngleton();
        System.out.println(StaticSIngleton.getInstance());
    }
}
