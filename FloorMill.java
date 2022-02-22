class FloorMill
{
	String price;
	int salaryOfEmployee;
	String name;
	public void chechWheat()
	{
			System.out.println("Yes its clean..");
	}
	public void isFloorFilterd()
	{
			System.out.println("Yes its Flitered..");
	}
	public static void main(String ar[])
	{
		FloorMill floorMill=new FloorMill();
		floorMill.price="200Kg";
		floorMill.salaryOfEmployee=5000;
		floorMill.name="Kamran Floor Mill";
		System.out.println("Name Of Mill:"+ floorMill.name);
		System.out.println("Price:"+ floorMill.price);
		System.out.println("Salaryf:"+ floorMill.salaryOfEmployee);
		floorMill.chechWheat();
		floorMill.isFloorFilterd();
	}
}
		
		
	