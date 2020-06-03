import java.lang.Math.*;
class P5
{
    public static void main(String[] args)
    {
        int c=0;long i=0;
        //int p[]=new p[1000];
        for(i=1;i<214748354700l;i++)
        {
            c=0;
            for(int j=1;j<=20;j++)
            if(i%j==0)
            {
            c++;
            }
            if(c==20)
            {
            System.out.println(i);
            break;
            }
        }
    }
}