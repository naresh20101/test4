class Resturent
{
	String name;
	String charges;
	String address;
	int noOfDishes;
public void checkDiscount()
{
	System.out.println("No There is no any Discount");
}
public void isItBuffet()
{
	System.out.println(" Yes we provide buffet System");
}
	public static void main(String ar[])
	{
		Resturent r=new Resturent();
		r.name="LAL QILA Resturent";
		r.charges="1500 rupees for one person";
		r.address="Auto Ban Road Hyderabad Sindh";
		r.noOfDishes=30;
		System.out.println("Name:"+r.name);
		System.out.println("Number of Dishes:"+ r.noOfDishes);
		System.out.println("Charges:"+r.charges);
		System.out.println("Address:"+ r.address);
		r.checkDiscount();
		r.isItBuffet();
	}
}
	