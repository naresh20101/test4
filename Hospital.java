class Hospital
{
	String DrName;
	int noOfBeds;
	int fees;
	public void checkSpecaliaztion()
	{
		System.out.println("I am Dental Surgon");
	}
	public void getAppointment()
	{
		System.out.println("Yes You are Appointed...");
	}
public static void main(String ar[])
{
	Hospital hospital=new Hospital();
	hospital.DrName="GOVIND KHATRI";
	hospital.noOfBeds=2;
	hospital.fees=300;
	System.out.println("Name of Doctor:"+ hospital.DrName);
	System.out.println("Number Of Beds:"+hospital.noOfBeds);
	System.out.println("Fees:"+hospital.fees);
	hospital.checkSpecaliaztion();
	hospital.getAppointment();
}
}
	
	