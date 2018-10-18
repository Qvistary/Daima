package daima4;//4-4
class Demo2
{
   int a,b;
   
   int method()      
   {
		return a+b;
   }
   int method(int c)
   {
		return a+b+c;
   }
   int method(int c,int d) 
   {
		return a+b+c+d;
   }
   Demo2(int a,int b)  
   {
		this.a = a;
       this.b = b;
   }
}
public class DemoOverload
{
	public static void main(String args[])
	{
       
	   Demo2 aDemo2 = new Demo2(1,2); 
       int a = aDemo2.method(); 
       System.out.println(a); 
       int b = aDemo2.method(3); 
       System.out.println(b);
       int c = aDemo2.method(3,4);
       System.out.println(c);
	}
}
