class Methods
{
int add(int a, int b)
{
	return a+b;
}
int add(double a, int b)
{
return (int)(a+b);
}
public static void main(String ae[])
{
	Methods m=new Methods();
	System.out.print(m.add(2,2));
}
}
	