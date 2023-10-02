package Lektion_31.practice.generics;

public class Json_Wrapper_1 {
    private Object value;

    public Json_Wrapper_1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " +  value + "}";

    }
}
