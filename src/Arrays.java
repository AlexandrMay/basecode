import java.util.ArrayList;
import java.util.List;

public class Arrays {
    private int count = 0;


    public static void main(String[] args) {

        int[] someArr = new int[] {3, 7, 6, 8, 9, 12, 12};


        Arrays arrays = new Arrays();

        arrays.arr2(someArr);
        System.out.println();
        arrays.arr3(someArr);
        System.out.println();
        arrays.average(someArr);
        System.out.println();
        arrays.countMethod();
        arrays.countMethod();
        arrays.countMethod();
    }
    public int countMethod () {
        count++;
        System.out.println(count);
        return count;
    }

    public int[] arr2 (int[] array) {   //поиск минимума-максимума
        int min = array[0];
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) max = array[j];
            if (array[j] < min) min = array[j];
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        return array;
    }

    public int [] arr3 (int[] array) {    //чётные эл-ты
        int even = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k]%2 == 0) even = array[k];
            System.out.println(even);
        }
        return array;
    }

    public double average (int[] array) { //среднее арифм
        double average = 0;
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[j];
            }
            average = sum / array.length;
            System.out.println(average);
        return average;
    }
}
