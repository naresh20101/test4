class Cow
{
	String color;
	int Weight;
	String Type;
	public void canEat()
	{
		System.out.println("Cow can Eat grass");
	}
	public void canGiveMilk()
	{
		System.out.println("It gives Milk");
	}
	public static void main(String ar[])
	{
		Cow c1=new Cow();
		c1.color="Light Black";
		c1.Weight=150;
		c1.Type="Australian";
		System.out.println("Color:"+c1.color);
		System.out.println("Weight:"+ c1.Weight);
		System.out.println("Type:"+ c1.Type);
		c1.canEat();
		c1.canGiveMilk();
	}
}
	