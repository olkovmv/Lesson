package Generic;

public class PairContener<T, K> {
    private T key;
    private K value;

    public PairContener(T key, K value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PairContener{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
