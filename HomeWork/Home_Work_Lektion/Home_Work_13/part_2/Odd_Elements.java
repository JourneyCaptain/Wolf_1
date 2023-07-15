package Home_Work_13.part_2;

import java.util.Random;

public class Odd_Elements {
    public static void main(String[] args) {


            int[] array = generateRandomArray(10);
            int sum = getSumOfOddElements(array);
            System.out.println("Сумма нечетных элементов массива: " + sum);
        }

        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(10) + 1;
            }
            return array;
        }

        public static int getSumOfOddElements(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    sum = sum + array[i];
                }
            }
            return sum;
        }
    }