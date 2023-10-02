package Lektion_31.practice.generics;

public class Json_Wrapper_2 < T  > {
    private T value;

    public Json_Wrapper_2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";


    }
}