import java.util.ArrayList;
import java.util.List;

public class NewClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 2);
        list.add(3, 3);
        list.add(4, 3);
        list.add(5, 4);


        removeDuplicates(list);

    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

        int counter = 0;
        while (counter < list.size() - 1) {
            if (list.get(counter) == list.get(counter + 1)) list.remove(counter + 1);
           else counter++;
        }
        System.out.println(list);
        return list;
    }
}


