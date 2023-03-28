import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    int id;

    public HomeWork(int id) {
        this.id = id;
    }

    public void doHomeWork(String s) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(1111);
        list.add(123123);
        list.add(12312);
        if ((s.startsWith("a") && s.hashCode() > 1000)
                || (s.startsWith("B") && s.length() <= 10)) {
            System.out.println("Doing homework: " + s);
        } else {
            System.out.println("Doing homework");
        }
    }
}
