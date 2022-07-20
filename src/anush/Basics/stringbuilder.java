package anush.Basics;

public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Krish");
        //string builder length
        System.out.println(sb.length());
        //transverse
        System.out.println(sb.charAt(3));
        //modify string usig setCharAt
        sb.setCharAt(0,'T');
        System.out.println(sb);
        //inserting character in set builder.
        sb.insert(0,'O');
        System.out.println(sb);
        //deleting a char from stringb
        sb.delete(0,1);
        System.out.println(sb);
        //appending char
        sb.append('h');
        System.out.println(sb);




    }

}
