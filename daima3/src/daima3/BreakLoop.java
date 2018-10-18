package daima3;//3-8

public class BreakLoop {
	public static void main(String arg[])
	{
		for (int i= 0;i<100;i++)
		{
			if (i==5) break;
			System.out.println("i :"+i);
		}
		System.out.println("Loop comolete.");
	}
	
}
