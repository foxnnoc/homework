package lesson15.task4;

public class Calkulator {
    public static <T extends Number, V extends Number> double sum(T t, V v) {
        return t.doubleValue() + v.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T t, V v) {
        return t.doubleValue() - v.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T t, V v) {
        return t.doubleValue() * v.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T t, V v) {
        return t.doubleValue() / v.doubleValue();
    }
}
