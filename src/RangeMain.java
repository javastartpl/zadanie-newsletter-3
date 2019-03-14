public class RangeMain {
    public static void main(String[] args) throws InterruptedException {
        int randomNumberInRange = (int) (Math.random() * 101);

        Number number = new Number(randomNumberInRange);
        for (Integer next : number) {
            System.out.println(next);
            Thread.sleep(10);
            main(new String[] {});
        }
    }
}
