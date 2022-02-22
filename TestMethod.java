class TestMethod
{
	public void checkPrime(int a)
	{
		int count=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
			count++;
		}
		if(count==2)
			printTable(a);
		else
			checkEvenOdd(a);
	}
	public void printTable(int b)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(b*i);
		}
	
	}
	public void checkEvenOdd(int c)
	{
		if(c%2==0)
			makePower(c);
		else
			makeSquarate(c);
		
	}
	public void makePower(int a)
	{
		int result=(int)Math.pow(a,4);
		System.out.println(result);
	}
	public void makeSquarate(int b)
	{
		int result=(int)Math.sqrt(b);
		System.out.println(result);
		
	}
	public static void main(String ar[])
	{
		TestMethod t=new TestMethod();
		t.checkPrime(4);
	}
	
}