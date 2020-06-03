class P2
{
    public static void main(String[] args)
    {
        int a=1,b=1,h=0;
        int total=0;
        while(h<=4000000)
        {
            if(h%2==0)
            {
                total += h;
            }
            h=a+b;
            b=a;
            a=h;
        }
        System.out.println("the total is "+ total);
    }
}