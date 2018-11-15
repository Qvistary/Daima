import java.util.HashSet;//7-19

public class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		hs.add("A");
		System.out.println(hs);

	}

}
