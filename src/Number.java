import java.util.Iterator;
import java.util.stream.IntStream;

class Number implements Iterable<Integer> {
    private int number;

    Number(int number) {
        this.number = number;
    }

    @Override
    public Iterator<Integer> iterator() {
        return IntStream.rangeClosed(number, number).iterator();
    }
}