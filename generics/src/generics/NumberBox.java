package generics;

// Bounded Type Parameter - Only Numbers
public class NumberBox<T extends Number> extends Box<T> {
    public double doubleValue() {
        return get().doubleValue();
    }
}
