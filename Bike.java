class Bike
{
	int modelYear;
	String name;
	String color;
	public void checkGear()
	{
		System.out.println("Gears are Ok..");
	}
	public void checkDistance()
	{
		System.out.println("Its Zero Meter");
	}
	public static void main(String ar[])
	{
		Bike b=new Bike();
		b.modelYear=2017;
		b.name="HONDA-CD70";
		b.color="Black";
		System.out.println("Model:"+ b.modelYear);
		System.out.println("Name:"+b.name);
		System.out.println("Color:"+b.color);
		b.checkGear();
		b.checkDistance();
	}
}
		