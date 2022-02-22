class Game
{
	String nameOfGame;
	int noOfPlayers;
	int ticketPrice;
	
	public void checkKit()
	{
		System.out.println("Yes Kit is complete..");
	}
	public void doToss()
	{
		System.out.println("You won the Toss");
		
	}
	public static void main(String ar[])
	{
		Game game=new Game();
		game.nameOfGame="Cricket";
		game.noOfPlayers=11;
		game.ticketPrice=500;
		System.out.println("Game:"+game.nameOfGame);
		System.out.println("Players:"+game.noOfPlayers);
		System.out.println("Ticket Price:"+game.ticketPrice);
		game.checkKit();
		game.doToss();
	}
}
	
		
		
	}
	
}