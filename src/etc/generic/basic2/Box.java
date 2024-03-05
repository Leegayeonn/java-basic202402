package etc.generic.basic2;

// 멀티 제네릭(key, value)
public class Box <K,V> {

    private K key;
    private V value;

    public Box(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get(K key){
        return this.value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("key=").append(key);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
