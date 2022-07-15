package anush.dsa;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        //add element.
        al.add(0);
        al.add(5);
        al.add(2);
        System.out.println(al);

        //get element.
        int a=al.get(1);
        System.out.println(a);
        //add elem in btwn.
        al.add(0,1);
        System.out.println(al);
        //set element.
        al.set(0,7);
        System.out.println(al);
        //delete element.
        al.remove(0);
        System.out.println(al);
        //.
        //int s= al.();
        //System.out.println(s);
        //sort
        Collections.sort(al);
        System.out.println(al);
    }
}
