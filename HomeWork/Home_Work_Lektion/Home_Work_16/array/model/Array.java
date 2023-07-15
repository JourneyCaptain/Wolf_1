package Home_Work_16.array.model;

public class Array {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }


    public double evenIndexedElements() {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i = i + 2) {
            sum = sum + array[i];
            count++;
        }

        if (count == 0) {
            return 0; // Return 0 if there are no elements with even indexes in the array
        }

        return (double) sum / count;//Return the value of the average by the elements of the array with even indices.
    }
}