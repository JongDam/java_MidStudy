package lang.immutable.change;

public class MutableObj {
    private int value;

    @Override
    public String toString() {
        return "MutableObj{" +
                "value=" + value +
                '}';
    }

    public int add(int addValue) {
        value = value + addValue;
        return value;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MutableObj(int value) {
        this.value = value;
    }
}
