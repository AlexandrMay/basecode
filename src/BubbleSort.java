public class BubbleSort {
    public static void main(String[] args) {

        int [] array = new int[]{22, 1, 10, 9, 3, 5, 9};

        arr(array);
        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }

    }

    public static int[] arr (int [] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j=0; j<i;j++){
                if (array[j] > array[j+1]){    //если закомментить условие - получим переворот массива
                    int tmp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }

            }

        }
        return array;
    }
}
