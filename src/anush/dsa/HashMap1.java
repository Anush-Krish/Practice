package anush.dsa;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();
        map.put("US",120);
        map.put("China",190);
        map.put("India",210);
        System.out.println(map);
        map.put("China",200);
        System.out.println(map);
        System.out.println(map.containsKey("US"));
        System.out.println(map.get("US"));
        // for(int val:arr) ----when  arr[12,13,14,15]
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e);
        }
        map.remove("US");

    }
}
