import java.util.ArrayList;
import java.util.List;

public class RangeMain {
    private static int randomNumber = (int) (Math.random() * 101);
    private static List<Integer> randomNumberList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        randomNumberList.add(randomNumber);
        printRandomNumber(randomNumberList);
    }

    private static void printRandomNumber(List<Integer> randomNumber) throws InterruptedException {
        for (Integer next : randomNumber) {
            System.out.println(next);
            System.gc();
            Thread.sleep(10);
            addRandomNumber(randomNumber);
        }
    }

    private static void addRandomNumber(List<Integer> randomNumberList) throws InterruptedException {
        randomNumberList.clear();
        randomNumber = (int) (Math.random() * 101);
        randomNumberList.add(randomNumber);
        printRandomNumber(randomNumberList);
    }
}
