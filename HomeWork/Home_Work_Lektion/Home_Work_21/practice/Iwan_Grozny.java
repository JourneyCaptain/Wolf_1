package Home_Work_21.practice;

public class Iwan_Grozny {
    public static void main(String[] args) {

       // Задача 2. Дано предложение: "Казнить нельзя помиловать".
       // Поменяйте первое и последнее слово в нем местами;
       // добавьте в него запятую на нужном месте и выведите на печать.



        String str = "Казнить нельзя помиловать";
        System.out.println(str);

        String[] words = str.split(" ");//разделение строки str на отдельные слова (массив строк)
        String firstWord = words[0];//присваивание значения первого элемента массива
        String lastWord = words[words.length - 1];// присваивание значения последнего элемента массива

        String middleWords = ""; //пустая строка
        for (int i = 1; i < words.length - 1; i++) {
            middleWords = middleWords + words[i] + " ";
        }

        String newStr =  lastWord + " " + middleWords + ", " + firstWord +"!";

        System.out.println(newStr);


    }
}
