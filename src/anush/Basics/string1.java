package anush.Basics;

public class string1 {
    public static void main(String args[]){
        //Concatenation
        String as="Anush";
        String ab="Krishna";
        String ui=as+" "+ab;
        System.out.println(ui);
        //length
        System.out.println(ui.length());
        //transverse using function charAt()
        for(int i=0;i<ui.length();i++){
            System.out.println(ui.charAt(i));
        }
        //substring
        System.out.println(ui.substring(0,5));
        System.out.println(ui.substring(6));
    }

}
