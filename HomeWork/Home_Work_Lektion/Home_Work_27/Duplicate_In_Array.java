package Home_Work_27;

public class Duplicate_In_Array {
    public static void main(String[] args) {

        // Задача 2. Поиск дубликатов в массиве.
        // Задумайте массив из 100 элементов и заполните его случайными
        // значениями целых чисел в интервале от 1 до 10.
        // Подсчитайте сколько и каких элементов встретилось более одного раза в этом массиве.
        int a = 100;

        int[] myArray = new int[a];
        for (int i = 0; i < a; i++) {
            myArray[i] = (int) (Math.random() * 10); // генерирует случайное число в диапазоне от 0 до 9.
        }
        System.out.print("Numbers: "); // Выводим массив на экран
        for (int i = 0; i < a; i++) {
            System.out.print(myArray[i] + " | ");
        }
        System.out.println("\nDuplicates:");

        for (int j = 0; j < myArray.length - 1; j++) {
            if (myArray[j] == myArray[j + 1]) {
                //Цикл for проходит по всем элементам массива,
                // начиная с индекса 0 (j = 0)до предпоследнего элемента (j < myArray.length-1).
                // При каждой итерации цикла происходит сравнение текущего элемента
                // myArray[j] с последующим элементом myArray[j+1].
                // Если myArray[j] и myArray[j+1] равны друг другу
                // (то есть являются дубликатами),
                // то условие if (myArray[j] == myArray[j+1]) становится истинным (true),
                // и выполняется блок кода, который идет за условием.

                System.out.println("duplicate item " + myArray[j + 1] + " at Location " + (j + 1));//дублирующий элемент по месту расположения
            }
        }

    }
}
