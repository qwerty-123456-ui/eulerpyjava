class P4
{
    public static void main(String[] args)
    {
        int a=100,b=100;
        int c,d,r,m,h;
        c=d=r=m=h=0;
        for(a=100;a<1000;a++)
        {
            for(b=100;b<1000;b++)
            {
                c=a*b;
                d=c;
                //System.out.println(c);
                while(c!=0)
                {
                    r= c % 10;
                    m=m * 10 + r;
                    c=c / 10;
                    //System.out.println(m);
                             //}
                System.out.println(m);
                }
                if(m == d)
                {
                    h=d;
                   System.out.println(h);
               //     System.out.println(d);
                 //   System.out.println(m);
                }
            
                //b++;
            }
            //a++;
        }
      // System.out.println(h);
    }
}