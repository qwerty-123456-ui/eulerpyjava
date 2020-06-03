class P3
{
    public static void main(String[] rga)
    {
        long s=600851475143l ;
        long a[]=new long[40];
        long b[]=new long[45];
        long j=1;
        int i=0;
        while(j!=s)
        {
                if(s%j==0)
                {
                    a[i]=j;
                    i++;
                }
            
            j++;
        }
        //for(long x:a)
       // System.out.println(x);
        i=2;
        int q=0;
        for(long x1:a)
        {
            int flag=0;
            for(i = 2; i <= x1/2; ++i)
            {
            // condition for nonprime number
               if(x1%i == 0)
               {
                    flag = 1;
                     break;
                }
            }
            if(flag==0)
            {
                b[q]=x1;
                q++;
            }
        }
        long x3=b[0];
        for(long x2:b)
        {
            if(x2>x3)
            x3=x2;
        }
        System.out.println(x3);
        
    }
}