package anush.Basics;

//all possible arrangement of string ABC  n!=3*2*1
public class BackTracingPermutation {
    public static void Permutation(String str,String perm,int indx){
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curchar=str.charAt(i);
            String NewStr=str.substring(0,i)+str.substring(i+1);
            Permutation(NewStr,perm+curchar,indx+1);
        }

    }
    public static void main(String[] args){
        String str="ABC";
        Permutation(str,"",0);
    }
}
