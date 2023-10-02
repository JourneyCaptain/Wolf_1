package Lektion_36.practice.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class City_1Test {
    City_1[] city_1s; // объявили массив объектов типа City

    @BeforeEach
    void setUp() {

        city_1s = new City_1[6];// создаем массив

        city_1s[0] = new City_1("Denver", 600_000);
        city_1s[1] = new City_1("Boston", 670_000);
        city_1s[2] = new City_1("Chicago", 2_700_000);
        city_1s[3] = new City_1("Atlanta", 470_000);
        city_1s[4] = new City_1("New York", 8_500_000);
        city_1s[5] = new City_1("Dallas", 1_300_000);

    }

    public void printArray(Object[] arr, String string) {
        System.out.println("============" + string + "=================");
        for (Object city : arr) {
            System.out.println(city);
        }
        System.out.println("=============================================");
    }

    @Test
    void testCopyOfRange() {
        printArray(city_1s, "Original array");

        City_1[] citiesCopyRange = Arrays.copyOfRange(city_1s, 1, city_1s.length - 1); // начальный элемент входит, конечный - нет
        printArray(citiesCopyRange, "cities range copy");


    }

    @Test
    void testSystemArrayCopy() {
        printArray(city_1s, "Original array");
        City_1[] citiesCopy = new City_1[city_1s.length * 2]; // объявили массив, увеличил его размер в 2 раза
        System.arraycopy(city_1s, 1, citiesCopy, 4, city_1s.length - 2);// poslednii element v ma sive imeet index  -1.
        printArray(citiesCopy, "System.arraycopy");

    }

    @Test
    void testInsertAndKeepSorted() {
        printArray(city_1s, "Original");
        Arrays.sort(city_1s);// сделали сортировку
        printArray(city_1s, "Natural order");
        City_1 city_1 = new City_1("SanFrancisco", 690_000);

        // скопировать массив в новый массив с длиной + 1
        City_1[] citiesCopy = Arrays.copyOf(city_1s, city_1s.length + 1); // на последнем месте будет null

        // найти индекс для вставляемого города с помощью BinarySearch
        int index = Arrays.binarySearch(citiesCopy, 0, citiesCopy.length -1, city_1);
        System.out.println(index);

        // определить реальный индекс, на какое место вставлять новый город в массив
        index = index >= 0 ? index : - index - 1; // Позиция куда вставлять - см. теорию прошлого урока

        // сдвинуть весь массив вправо на 1 позицию (освобождаем место новому городу)
        System.arraycopy(citiesCopy, index, citiesCopy, index + 1, citiesCopy.length - index - 1);

        // поставить новый город на нужное место
        citiesCopy [index] = city_1;

        // сделать массив опять с именем cities
        city_1s = citiesCopy;

        // напечатать полученный массив
        printArray(city_1s, "Order after insert new city");

    }

}