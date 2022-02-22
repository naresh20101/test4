class Liberary
{
	int noOfBooks;
	int noOfHalls;
	String address;
	public void issueBook()
	{
		System.out.println("Yes You can Issue..");
	}
	public void checkNewsPaper()
	{
		System.out.println("Yes News Paper is available..");
	}
	public static void main(String ar[])
	{
		Liberary liberary=new Liberary();
		liberary.noOfBooks=5000;
		liberary.noOfHalls=4;
		liberary.address="Opposite Muet Auditorium";
		System.out.println("Number Of Books are.."+ liberary.noOfBooks);
		System.out.println("Number of Halls are.."+ liberary.noOfHalls);
		System.out.println("The address is.."+ liberary.address);
		liberary.issueBook();
		liberary.checkNewsPaper();
	}
}
		
	
		