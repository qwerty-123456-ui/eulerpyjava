import java.util.*;
class P7
{
    public static void main(String[] args)
    {
        int  k=0;
        int n=0;
        LinkedList p=new LinkedList();
        long i=2;
        while(i<200000l && n!=10001)
        {
            int c=0;
            for(long j=2;j<=(i/2);j++)
            {
              //System.out.println(i);
              if(i%j==0)
              {
                c=1;
                i++;
                break;
              }
            }
            //i++;
            if(c==0)
            {
                //System.out.println(c);
                //System.out.println(i);
                //Integer i1=Integer.valueOf("i");
                if(n<=10001)
                {
                p.add(i);
              //  System.out.println(p);
                i++;
                }
                n++;
            }
        }
        System.out.println(n);
        System.out.println(p.getLast());
    }
}