package anush.dsa;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set);
        System.out.println(set.size());
        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

}
