class TvLongue
{
	int noOfSeats;
	int TvSize;
	String nameOfTv;
	public void isAirConditioner()
	{
		System.out.println("Yes Its Air Conditioner..");
	}
	public void checkShows()
	{
		System.out.println("Huge Number of Shows available");
	}
	public static void main(String ar[])
	{
		TvLongue t=new TvLongue();
		t.nameOfTv="SONY TV";
		t.TvSize=34;
		t.noOfSeats=50;
		System.out.println("Seats are Available:"+ t.noOfSeats);
		System.out.println("Size Of TV:"+ t.TvSize);
		System.out.println("TV Name:"+ t.nameOfTv);
		t.isAirConditioner();
		t.checkShows();
	}
}
		
		
		
		
	