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
       System.out.println("����һ��Ա����a��"+aDemo.a);
       System.out.println("����һ��Ա����b��"+aDemo.b);
       System.out.println("����һ��Ա����c��"+aDemo.c);
    
		Demo bDemo = new Demo(1);
       System.out.println("��������Ա����a��"+bDemo.a);
       System.out.println("��������Ա����b��"+bDemo.b);
       System.out.println("��������Ա����c��"+bDemo.c);
   
		Demo cDemo = new Demo(1,2);
       System.out.println("��������Ա����a��"+cDemo.a);
       System.out.println("��������Ա����b��"+cDemo.b);
       System.out.println("��������Ա����c��"+cDemo.c);
     
		Demo dDemo = new Demo(1,2,3);
       System.out.println("�����ĳ�Ա����a��"+dDemo.a);
       System.out.println("�����ĳ�Ա����b��"+dDemo.b);
       System.out.println("�����ĳ�Ա����c��"+dDemo.c);
	}
}
