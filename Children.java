class Children
{
	String name;
	int  age;
	String gender;
	public void canPlay()
	{
		System.out.println("Chilren enjoying playing with toys");
	}
	public void canEat()
	{
		System.out.println("children can eat more Toffees");
	}
	public static void main(String ar[])
	{
		Children ch1=new Children();
		ch1.name="Ashish";
		ch1.age=3;
		ch1.gender="BabyBoy";
		Children ch2=new Children();
		ch2.name="Jai Verdhan";
		ch2.age=2;
		ch2.gender="BabBoy";
		Children ch3=new Children();
		ch3.name="Rachna";
		ch3.age=3;
		ch3.gender="BabyGirl";
		System.out.println("Name:"+ ch1.name);
		System.out.println("Age:"+ ch1.age);
		System.out.println("Gender:"+ch1.gender);
		ch1.canPlay();
		ch1.canEat();
	}
}