import java.util.Iterator;
import java.util.Random;

public class Range implements Iterable<Integer> {
    private int startNumber;
    private int endNumber;
    Range(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Random().ints(startNumber, endNumber).iterator();
    }
}