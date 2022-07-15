package anush.oops;

//paramaterized constructor
class Students{
    int marks;
    String name;

    Students(int marks,String name)
    {
        this.marks=marks;
        this.name=name;

    }
    public void Printinfo(){
        System.out.println(this.marks);//also without this keyword
        System.out.println(this.name);//also without this keyword
    }
}


public class Oops3 {
    public static void main(String args[]){
        Students stu1=new Students(99,"Krish");
        stu1.Printinfo();


    }
}
