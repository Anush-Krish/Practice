package anush.lab;


public class PerfectRange {
    public static void main(String arr[])
    {
        int i,j,c;
        for(i=1;i<=100;i++)
        {
            c=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                    c+=j;
            }
            if(c==i)
                System.out.println(i);
        }
    }
}
