package Lektion_31.practice.generics;

public class Json_Wrapper_1Appl {
    public static void main(String[] args) {

        Json_Wrapper_1 wrapper1 = new Json_Wrapper_1("10");
        System.out.println(wrapper1);
        System.out.println();

       Integer a = (Integer) wrapper1.getValue();


    }
}
