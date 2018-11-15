public class GroupThree{//5-13
    private static int count;   
    private String name;   
    public class Student{

    private int count;   
    private String name;   
    public void Output(int count)
    {
    	count++;    
    	this.count++;   
    		GroupThree.count++;   
    		GroupThree.this.count++;  
    		System.out.println(count+""+this.count+""+
            GroupThree.count+""+GroupThree.this.count++);
    }
    }
public Student aStu()    
  {
    return  new Student();
  }
  public static void main(String args[])  {

    GroupThree g3=new GroupThree ();
    g3.count=10;                
    GroupThree.Student s1=g3.aStu();    
    s1.Output(5);
    }
    }
