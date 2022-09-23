package anush.Generics;

import java.util.ArrayList;


class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }



    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public MyGeneric(int val, T1 t1,T2 t2){
        this.val=val;
        this.t1=t1;
        this.t2=t2;
    }
}

public class G1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        //arr.add("str");
        arr.add(2);
        int r=  arr.get(1);
        MyGeneric<String,Integer> g1=new MyGeneric<>(1,"string",13);
        String str=g1.getT1();
        int e=g1.getT2();
        System.out.println("T2->  "+e);
        System.out.println("T1->  "+str);


    }
}
