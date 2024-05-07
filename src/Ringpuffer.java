import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ringpuffer<T> implements Iterable<T>{

    private T[] array;
    private int capacity;
    private int size = 0;

    public Ringpuffer(int capacity){
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public void add(T o) {           //füge hinten an
        if (size == capacity){
            throw new IllegalArgumentException("Puffer bereits voll");
        }
        array[size] = o;
        ++size;
    }
    public T show(int i){            //zeige Eintrag an der Stelle aber ändere nichts
        if (i < 0 | i >= size){
            throw new NoSuchElementException("Position existiert nicht");
        }
        return array[i];
    }

    @Override
    public Iterator<T> iterator() {
        return new RingIterator();
    }

    private class RingIterator implements Iterator<T>{

        private int i = 0;

        @Override
        public boolean hasNext() {
            if (size == 0){
                return false;
            }
            return true;            //weil es ein Ringpuffer ist und der Iterator rund läuft
        }

        @Override
        public T next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            if (i == size){     //wenn du hinten im array bist fange wieder vorne an
                i = 0;
            }
            return array[i++];
        }
    }
}
