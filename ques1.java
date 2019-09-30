class q1 
{
	public static void main(String[] args) 
	{
		int belowvalue=1000,sum=0,i;
		for(i=1;i<belowvalue;i++)
		{
			if(i%3==0 ||i%5==0)
				sum+=i;
		}
		System.out.println("Result :"+sum);
	}
}
