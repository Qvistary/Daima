package daima4;//4-5
class Demo
{
  
   int a,b,c;
   public Demo()          
   {
	}
   public Demo(int a)     
   {
		this.a = a;
   }
 
   public Demo(int a,int b) 
   {
		this.a = a;
		this.b = b;
	}
   public Demo(int a,int b,int c) 
   {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class ConstructionOverload
{
	public static void main(String args[])
   {
  
	   Demo aDemo = new Demo();
       System.out.println("方法一成员变量a："+aDemo.a);
       System.out.println("方法一成员变量b："+aDemo.b);
       System.out.println("方法一成员变量c："+aDemo.c);
    
		Demo bDemo = new Demo(1);
       System.out.println("方法二成员变量a："+bDemo.a);
       System.out.println("方法二成员变量b："+bDemo.b);
       System.out.println("方法二成员变量c："+bDemo.c);
   
		Demo cDemo = new Demo(1,2);
       System.out.println("方法三成员变量a："+cDemo.a);
       System.out.println("方法三成员变量b："+cDemo.b);
       System.out.println("方法三成员变量c："+cDemo.c);
     
		Demo dDemo = new Demo(1,2,3);
       System.out.println("方法四成员变量a："+dDemo.a);
       System.out.println("方法四成员变量b："+dDemo.b);
       System.out.println("方法四成员变量c："+dDemo.c);
	}
}
