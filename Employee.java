class Employee
{
	String name;
	int salary;
	String exprience;
	public void chechWorkout()
	{
		System.out.println("Yes Employees are doing good");
	}
	public void checkBonus()
	{
		System.out.println("Yes Bonus are provided to Employees");
	}
public static void main(String ar[])
{
	Employee e1=new Employee();
	e1.name="Turab";
	e1.salary=60000;
	e1.exprience="2 Year";
	System.out.println("Name;"+e1.name);
	System.out.println("Salary:"+e1.salary);
	System.out.println("Experience:"+ e1.exprience);
	e1.chechWorkout();
	e1.checkBonus();
}
}
	
	