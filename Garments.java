class Garments
{
	int priceOfJeans;
	int priceOfSweater;
	String colorOfJeans;
	String colorOfSweater;
	public void IsJeansStretchable()
	{
		System.out.println("Yes Its Stretchable..");
	}
	public void IsSweaterSoft()
	{
		System.out.println("Yes Its Soft..");
	}
	public static void main(String ar[])
	{
		Garments garments=new Garments();
		garments.priceOfJeans=700;
		garments.priceOfSweater=1200;
		garments.colorOfJeans="Dark Blue";
		garments.colorOfSweater="Grey";
		System.out.println("Price of Jeans.."+ garments.priceOfJeans);
		System.out.println("Price Of Sweater.."+ garments.priceOfSweater);
		System.out.println("Color of Jeans.."+ garments.colorOfJeans);
		System.out.println("Color of Sweater.."+ garments.colorOfSweater);
		garments.IsJeansStretchable();
		garments.IsSweaterSoft();
	}
}