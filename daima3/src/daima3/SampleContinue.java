package daima3;//3.3.2

public class SampleContinue {
	public static void main(String arg[])
	{
		for (int i= 1;i<20;i++)
		{
			System.out.print(i + " ");
			if (i%5!=0)
				continue;
			System.out.println("");
		}
	}
}
