package Lektion_1;

public class Pension {
    public static void main(String[] args) {
        //возраст выхода на пенсию
        //обьявили переменную по типу int
        int age_pension_number; //Camel case: agePensionNumber;
        String age_pension_text;
//присвоили значение 65 переменной age_pension
//присвоили значение "Возраст выхода на пенсию " переменной age_pension_text
        age_pension_number = 65;
        age_pension_text = "Возраст выхода на пенсию: ";
        System.out.println(age_pension_text + age_pension_number);
        //возраст поступления в университет
        //обьявили переменную по типу int и присвоили ей значение 20
        int ageUni = 20;
        System.out.println("Возраст поступления в университет " + ageUni);
        //1. Переменные пишутся только латинскими(английскими) буквами
        //2. Имя переменной должно быть "говорящим" о задаче этой переменной
        //3. Имя переменной не может начинаться с цифр
        //4. Snake case: int age_pension;
        //    Camel case: int agePension;
        //5. Нельзя использовать в названиях переменных зарезервированные слова:
    /*
     abstract, assert, boolean, break, byte, case, catch, char, class, const, continue,
      default, do, double, else, enum, extends, false, final, finally, float, for, goto,
       if, implements, import, instanceof, int, interface, long, native, new, null,
       package, private, protected, public, return, short, static, strictfp, String,
        super, switch, synchronized, this, throw, throws, transient, true, try, void,
        volatile, while
     */
        //System.out.println("Меня зовут Игорь");
        //System.out.println("ÜÖ");
        //System.out.println("Ich komme aus Russland");
    }//закрываем метод main
    }

