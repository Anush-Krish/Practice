package anush.oops;

//Polymorphism:
class Studentt{
    String name;
    int age;
    Studentt(String name,int age){
        this.name=name;
        this.age=age;

    }

    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name,int age){
        System.out.println(this.name+" "+this.age);
    }


}
public class Oops5 {
    public static void main(String[] args){
        Studentt s1=new Studentt("Krish",14);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);

    }
}
