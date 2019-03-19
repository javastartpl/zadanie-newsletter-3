import java.util.Iterator;
import java.util.Random;

public class Range implements Iterable<Integer>{
    private int startNumber;
    private int endNumber;

    public Range(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public int getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(int endNumber) {
        this.endNumber = endNumber;
    }

    @Override
    public Iterator <Integer> iterator() {
        return new Random().ints(startNumber,endNumber).iterator();
    }
}
