package Lektion_31.practice.generics;

public class Wrapper_2Appl {
    public static void main(String[] args) {

        Json_Wrapper_2<Integer> wrapper2 = new Json_Wrapper_2<>(10);
        System.out.println(wrapper2);

        Integer a = wrapper2.getValue();
        System.out.println(a * 51);
    }
}
//public <T> void genericDisplay(T element) {
//        System.out.println(element.getClass() + " = " + element);
//    }