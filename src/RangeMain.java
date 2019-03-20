public class RangeMain {

    public static void main(String[] args) {
        forEach();
    }

    private static void forEach() {
        Range range = new Range();
        for (Integer ignored : range) {
            System.out.println((int) (Math.random() * 101));
        }
        System.gc();
        forEach();
    }
}