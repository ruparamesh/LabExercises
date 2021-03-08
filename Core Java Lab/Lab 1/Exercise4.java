class Exercise4
{
            public static void main(String args[])
            {
                        int n,f;
                        //Scanner scr=new Scanner(System.in);
                        //System.out.println("\nEnter n value:  ");
                       // n=scr.nextInt();
			n = 10;
                        for(int i=2;i<=n;i++)
                        {
                                    f=0;
                                    for(int j=2;j<=i/2;j++)
                                    if((i%j)==0)
                                    {
                                                f=1;
                                                break;
                                    }
                        if(f==0)
                        System.out.print(i+"   ");
                        }
            }
}
                       