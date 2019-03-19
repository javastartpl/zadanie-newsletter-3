import java.util.Iterator;
import java.util.stream.IntStream;

class Range implements Iterable<Integer> {
    private int start;
    private int end;

    Range() {
        this.start = Integer.MIN_VALUE;
        this.end = Integer.MAX_VALUE;
    }

    @Override
    public Iterator<Integer> iterator() {
        return IntStream.rangeClosed(start, end).iterator();
    }
}