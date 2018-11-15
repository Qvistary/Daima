class A  { //5-3
	 public int n;
	 public A()	{
	 }
    public A(int n){
		 this.n = n;
	 }
    int method(){
		return n;
    }
}
public class B extends A { 
	public B()	{
		super(15);
	}
	public static void main(String args[]){
	    A aInstance = new B( );  
		int b=aInstance.method();
		System.out.println("类A中的成员变量："+b);
	}
}
