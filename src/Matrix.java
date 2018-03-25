public class Matrix {


    public static int resultMethod(int [][] array){
        int result = array[0][0];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                if(result < array[i][j]) result = array[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int [][] array = {{5, 7, 10, 3}, {3, 2, 1, 23}, {7, 12, 6, 9}, {9, 2, 6, 14}};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Максимальное значение: " + resultMethod(array));
    }
}
