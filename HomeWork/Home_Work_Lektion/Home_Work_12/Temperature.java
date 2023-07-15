package Home_Work_12;

public class Temperature {
    public static void main(String[] args) {

//           Задача 1
//           Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
//           Выведите на печать температуру, которая была во вторник и затем в четверг.
//           Найти среднюю температуру за прошлую неделю.

        int daysInWeek = 7;
        double[] temperatureArray = {15, 23, 22, 20, 25, 26, 18,};

        //Getting the temperature for Tuesday (index 1) and Thursday (index 3)
        double temperatureTuesday = temperatureArray[1];
        double temperatureThursday = temperatureArray[3];

        double sum = 0;
        for (double temperature : temperatureArray) {
            sum += temperature;
        }

        double averageTemperature = sum / daysInWeek;


        System.out.println("Temperature on Tuesday: " + temperatureTuesday);
        System.out.println("Temperature on Thursday: " + temperatureThursday);
        System.out.printf("Average temperature of last week: %.2f " , averageTemperature);

    }

}



