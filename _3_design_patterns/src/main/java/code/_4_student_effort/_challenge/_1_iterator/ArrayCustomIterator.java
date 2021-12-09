package code._4_student_effort._challenge._1_iterator;

public class ArrayCustomIterator {
    private int curentIndex;
    private int[] arr;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.curentIndex = 0;
    }

    boolean hasNext() {
        if (this.curentIndex < this.arr.length)
            return true;
        return false;
    }

    int next() {
        return this.arr[curentIndex++];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,9,0,2,1,5};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
