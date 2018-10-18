package daima4;//4-1
public class EmpInfo {
   String name;         
   String designation;  
   String department;   
   
   void print() {      
      System.out.println(name + " is " + designation + " at " + department); 
   }
  
   public static void main(String argv[]){   
     EmpInfo employee = new EmpInfo();   
     employee.name = " Robert Javaman " ; 
     employee.designation = " Manager " ;  
     employee.department = " Coffee Shop " ;  
     employee.print();                    
    }
 }
