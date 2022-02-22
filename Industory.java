class Industory
{
	int noOfEmployee;
	int salary;
	String name;
	public void checkProducts()
	{
		System.out.println("Products are Good..");
	}
	public void powerRoom()
	{
		System.out.println("It is Ok..");
	}
	public static void main(String ar[])
	{
	Industory industory =new Industory();
	industory.noOfEmployee=500;
	industory.name="Cotton Industory";
	industory.salary=10000;
	System.out.println("Name Of Industory:"+ industory.name);
	System.out.println("Number of Employees:"+ industory.noOfEmployee);
	System.out.println("Salary of Employees:"+ industory.salary);
		industory.checkProducts();
		industory.powerRoom();
	}
}
	