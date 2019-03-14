public class RangeMain {
    public static void main(String[] args) throws InterruptedException {
        int randomNumberInRange = (int) (Math.random() * 101);

        try {
            Number number = new Number(randomNumberInRange);
            for (Integer next : number) {
                System.out.println(next);
                Thread.sleep(10);
                System.gc();
                main(new String[]{});
            }
        } catch (java.lang.StackOverflowError so) {
            System.gc();
            so.printStackTrace();
        }
    }
}
