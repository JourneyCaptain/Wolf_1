package Home_Work_28.duplicat_in_array;

public class Duplicate_Array {
    // Задача 2. Поиск дубликатов в массиве.
    // Задумайте массив из 100 элементов и заполните его случайными
    // значениями целых чисел в интервале от 1 до 10.
    // Подсчитайте сколько и каких элементов встретилось более одного раза в этом массиве.
    public int displayArr (int[] arr) {
        int count = 0;

        int a = 100; // размер элементов.
        int[] myArray = new int[a];
        for (int i = 0; i < a; i++) {
            myArray[i] = (int) (Math.random() * 10) + 1;//генерирует случайное число в диапазоне от 1 до 10.
            count++;
        }
        return count;
    }
    public int displayNumbers(int[] myArray) {
        int count = 0;

        System.out.println("Numbers:");// Выводим массив на экран
        for (int arr : myArray) {
            System.out.print(arr + " | ");
            count++;
        }
        return count ;
    }
    public int displayDuplicates(int[] myArray) {
        int count = 0;
        System.out.println("\nDuplicates:");
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == myArray[i + 1]) {
                System.out.println("Duplicate item " + myArray[i + 1] + " at location " + (i + 1)); // дублирующий элемент по месту расположения
                count++;
            }
        }
        return count;
    }
}
