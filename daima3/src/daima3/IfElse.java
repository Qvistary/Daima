package daima3;//3-1

public class IfElse {
	public static void main(String arg[])
	{
		int month = 5;
		String season;
		if (month == 12||month == 1||month == 2)
			season= "Winter";
		else if (month == 3||month == 4||month == 5)
			season= "Spring";
		else if (month == 6||month == 7||month == 8)
			season= "Summer";
		else if (month == 9||month == 10||month == 11)
			season= "Autumn";
		else 
			season = "It is a wrong number !";
		System.out.println("May is in the "+ season + ".");
	}

}
