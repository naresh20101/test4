import java.util.Scanner;
class GymManagementSystem
{
	Scanner s1=new Scanner(System.in);
	String name;
	int rollNo;
	int fees;
	String month;
	int year;
	public void registration()
	{	System.out.println("--------------Registeration--------------");
		System.out.print("Name: ");
		name=s1.next();
		System.out.print("Roll Number: ");
		rollNo=s1.nextInt();
		System.out.print("Fess: ");
		fees=s1.nextInt();
		System.out.print("Month: ");
		month=s1.next();
		System.out.print("Year: ");
		year=s1.nextInt();
		System.out.println("------Registeration Complete Successfully-------");
		manue();
	}
	public void update()
	{
		System.out.println("-----------------Update------------------");
		System.out.println("Enter Roll Number:");
		int r=s1.nextInt();
		if(r==rollNo)
		{
		System.out.print("Name: ");
		name=s1.next();
		System.out.print("Roll Number: ");
		rollNo=s1.nextInt();
		System.out.print("Fess: ");
		fees=s1.nextInt();
		System.out.print("Month: ");
		month=s1.next();
		System.out.print("Year: ");
		year=s1.nextInt();
		}
		else
		{
			System.out.println("Not found");
		}
		manue();
		
	}
	public void delete()
	{
		System.out.println("---------------Delete----------------");
		name=null;
		rollNo=0;
		fees=0;
		month=null;
		year=0;
		manue();
		
	}
	public void view()
	{
		System.out.println("------------------INFORMATION------------------");
		System.out.println("Name:"+ name);
		System.out.println("Roll Number:"+ rollNo);
		System.out.println("Fees:"+ fees);
		System.out.println("Month:"+ month);
		System.out.println("Year:"+ year);
		manue();
	}
	public void manue()
	{	
			System.out.println("1. Registeration");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. View");
			System.out.println("5. Exit");
			int i=s1.nextInt();
			if(i==1)
			{
				registration();
			}
			else if(i==2)
			{
				delete();
			}
			else if(i==3)
			{
				update();
			}
			else if(i==4)
			{
				view();
			}
			else
			{
			}
	}
	public static void main(String ar[])
	{
		System.out.println("           <<<<<< WELOME TO GYM MANAGEMENT SYSTEM >>>>>>   ");
		Scanner s=new Scanner(System.in);
		GymManagementSystem g=new GymManagementSystem();
		g.manue();
	}

	
}