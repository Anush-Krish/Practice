package anush.temp;

import java.util.ArrayList;
import java.util.List;

public class temp1 {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.forEach(c-> System.out.println(c));
    }
}
