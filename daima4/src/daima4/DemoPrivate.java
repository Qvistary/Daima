package daima4;//4-12
public class DemoPrivate{
	public int a; 
   	private int b; 

   public int getA(){ 
			return a;
	}
   private int getB(){ 
   		return b;
   }
	public DemoPrivate(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String args[])
	{
		DemoPrivate aDemoPrivate = new DemoPrivate(1,2);
      
		int a = aDemoPrivate.getA();
		System.out.println("变量a的值："+a);
     
       int b = aDemoPrivate.getB();
		System.out.println("变量b的值："+b);
	}
    }