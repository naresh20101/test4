class Glasses
{
	String companyName;
	String frameType;
	String glassType;
	int price;
	public void checkLense()
	{
		System.out.println("What type of Lense You have to Buy");
	}
	public void canFlexible()
	{
		System.out.println("yes we also have Flexible glasses");
	}
	public static void main(String ar[])
	{
		Glasses g=new Glasses();
		g.companyName="RayBin";
		g.frameType="Plastic";
		g.glassType="MultiColor";
		g.price=800;
		System.out.println("Company Name:"+g.companyName);
		System.out.println("Frame Type:"+ g.frameType);
		System.out.println("Glasses Type:"+g.glassType);
		System.out.println("Price:"+ g.price);
		g.checkLense();
		g.canFlexible();
		
	}
}