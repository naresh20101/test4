import java.util.Scanner;
class AtmManagement
{
	Scanner s=new Scanner(System.in);
	Atm at=new Atm();
	
	public void createAccount()
	{
		System.out.println("......New Account.....");
		System.out.print("Enter Name:");
		String acctHolder=s.next();
		at.setAcctHolder(acctHolder);
		System.out.print("Enter Acount Number:");
		int acctNo=s.nextInt();
		at.setAcctNo(acctNo);
		System.out.print("Enter age:");
		int age=s.nextInt();
		at.setAge(age);
		System.out.print("Enter Balance:");
		int balance=s.nextInt();
		at.setBalance(balance);
		System.out.print("Enter Bank:");
		String bank=s.next();
		at.setBank(bank);
		System.out.println("............Acount Created Successfully...........");
		menu();
		}
	public void delete()
	{
		System.out.println("Enter Acount No:");
		int act=s.nextInt();
		if(at.getAcctNo()==act)
		{
			at.setAcctHolder("");
			at.setAcctNo(0);
			at.setBalance(0);
			at.setBank("");
			System.out.println("Deleted Sucessfully");
		
		}
		else
			System.out.println("Not Found");
		menu();
		
			
	}
	public void deposite()
	{
		System.out.println(".......................DEPOSITE........................");
		System.out.print("Enter Acount No:");
		int act=s.nextInt();
		if(at.getAcctNo()==act)
		{
			
			int balance=at.getBalance();
			System.out.print("Enter amount  to deposite:");
			int amount=s.nextInt();
			if(amount>0)
			{
				balance+=amount;
			at.setBalance(balance);
			System.out.println("......................DEPOSITE SUCCESSFULY......................");
			menu();
			}
		}
			else
			{
				System.out.println(act +"Not found");
			}
			menu();
			
			
	}
	
	public void withdraw()
	{
		System.out.println("..................WITHDRAW...................");
		System.out.print("Enter Account Number:");
		int act=s.nextInt();
		if(at.getAcctNo()==act)
		{
			int balance=at.getBalance();
			System.out.print("Enter Amount to Withdraw:");
			int withdraw=s.nextInt();
			if(withdraw<balance)
			{
			balance-=withdraw;
		at.setBalance(balance);
			System.out.println(".....................WITHDRAW SUCCESSFULY.......................");
			}
			else
			{
				System.out.println("Insufficient amount:");
			}
		}
		else
		{
			System.out.print(act+ "Not Found");
		}
		menu();
	}
	public void view()
	{
		System.out.println("Name: "+at.getAcctHolder());
		System.out.println("Acount Number: " +at.getAcctNo());
		System.out.println("Balance: " +at.getBalance());
		System.out.println("Age: " +at.getAge());
		System.out.println("Bank: "+at.getBank());
		menu();
	}
	public void menu()
	{
		System.out.println("1. Create Account");
		System.out.println("2. Delete Account");
		System.out.println("3. Deposite Amount");
		System.out.println("4. Withdraw Amount");
		System.out.println("5. View");
		System.out.println("6. Exit");
		System.out.println("Choose 1-6");
		int choice=s.nextInt();
		if(choice==1)
		createAccount();
	else if(choice==2)
		delete();
	else if(choice==3)
		deposite();
	else if(choice==4)
		withdraw();
	else if(choice==5)
		view();
	else
		System.out.println("Enter correct choice");
	}
}