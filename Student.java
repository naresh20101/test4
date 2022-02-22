class Human
{
	String name;
	int age;
	public void eat()
	{
		System.out.println("Eating..");
	}
	public void sleep()
	{
		System.out.println("Sleeping..");
	}
}
class Student extends Human
{
	public void exam()
	{
		System.out.println("Exam on Monday");
	}
	public void sleep()
	{
		System.out.println(" Student always Sleeping..");
	}

	public static void main(String a[])
	{
		Human s=new Student();
		
		s.name="Naresh";
		s.age=20;
		s.eat();
		s.sleep();
		s.exam();
		System.out.println(s.name);
		System.out.println(s.age);
		
	}
}
	