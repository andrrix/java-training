package code._4_student_effort;


public class ShadowTest {
    public int x = 0;

    class FirstLevel {
        public int x = 1;

        public FirstLevel() {};

        void methodInFirstLevel(int x) {
            System.out.println("x=" + x);
            System.out.println("this.x=" + this.x);
            System.out.println("ShadowTest.this.x=" + ShadowTest.this.x);
        }
    }


}
