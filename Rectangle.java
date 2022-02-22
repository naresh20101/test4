class Rectangle
{
	int length;
	int width;
public void checkSides()
{
	System.out.println("Its has Four sides:");
}
public void calculateArea()
{
	System.out.println("Area Is:"+ length*width);
}
public static void main(String ar[])
{
	Rectangle r=new Rectangle();
	r.length=4;
	r.width=5;
	System.out.println("Length:"+ r.length);
	System.out.println("Width:"+ r.width);
	r.checkSides();
	r.calculateArea();
}
}