import java.util.*;//6-5
public class TestToken
{
   public static void main(String args[])
   {
	StringTokenizer st = new StringTokenizer("this is a Java programming");
        while(st.hasMoreTokens())
        {
		     System.out.println(st.nextToken());
      }
   }
}
