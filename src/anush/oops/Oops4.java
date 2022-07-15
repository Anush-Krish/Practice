package anush.oops;

//copy constructor.
class Stu{
    String name;
    int age;
    Stu(Stu stu1){
        this.age=stu1.age;
        this.name=stu1.name;

    }
    Stu(){}
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }



}
public class Oops4 {
    public static void main(String[] args){
        Stu stu1=new Stu();
        stu1.name="Anush";
        stu1.age=19;
        Stu stu2=new Stu(stu1);
        stu2.printinfo();


    }
}
