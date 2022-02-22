class Shoes
{
	int size;
	int price;
	String color;
	String companyName;
public void checkWarranty()
{
	System.out.println("Yes Its has one Year Warranty");
}
public void chechJogers()
{
	System.out.println("Yes Jogers are also Available");
}
public static void main(String ar[])
{
	Shoes shoe=new Shoes();
	shoe.size=7;
	shoe.price=1500;
	shoe.color="Black";
	shoe.companyName="Bata";
	System.out.println("Company Name:"+shoe.companyName);
	System.out.println("Color:"+shoe.color);
	System.out.println("Size:"+shoe.size);
	System.out.println("Price:"+shoe.price);
	shoe.checkWarranty();
	shoe.chechJogers();
}

}