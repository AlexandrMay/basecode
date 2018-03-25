import java.util.ArrayList;
import java.util.List;

public class generic {
    public static void main(String[] args) {

        Cell stringCell = new Cell<>();
        stringCell.setT("hello");
        Object s = stringCell.getT();
        System.out.println(s);

        Cell intCell = new Cell();
        intCell.setT(20);
        Object i = intCell.getT();
        System.out.println(i);

        Cell<String> cell = new Cell<>();
        System.out.println(cell.getE(new Integer(5)));
    }
}

class Cell <T> {
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    T t;

    <E> E getE(E e) {
        return e;
    }

}

class GenericMethods {
    <T> T method( T t){
        return t;
    }
}
