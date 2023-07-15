package Home_Work_14.part_2;

public class break1 {
    public static void main(String[] args) {

//        Задача 1. изменить код задач про:
//
//        сумма нечетных чисел в массиве
//        умножать числа с четными индексами в массиве так,
//        чтобы использовались операторы break или continue.


        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int box = 0;
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                box = array[i];
                result = result + box;
                result = result * box;
                //break;

            }


            System.out.println("Odd number " + box );

        }
         System.out.println("Total sum is: "  + result);

    }

}






















