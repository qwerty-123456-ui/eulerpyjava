class P6
{
    public static void main(String[] args)
    {
        long sqofsum=0,sumofsq=0,sum=0;
        for(int i=1;i<=100;i++)
        {
            sumofsq+=i*i;
        }
        for(int i=1;i<=100;i++)
        {
            sum+=i;
        }
        sqofsum=sum*sum;
        System.out.println(sqofsum-sumofsq);
    }
}