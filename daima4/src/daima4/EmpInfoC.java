package daima4;//4-3
public class EmpInfoC {
   String name;         
   String designation;  
   String department;   
   
   public  EmpInfoC(String name,String designation,
String department){ 
this.name=name;
      this.designation=designation;
      this.department=department;
}  


   void print() {      
      System.out.println(name + " is " + designation + " at " + department); 
   }
  
   public static void main(String argv[]){   
     EmpInfoC employee = 
new EmpInfoC("Robert Javaman ","Manager","Coffee Shop"); 
 
        employee.print();         
     }
 }
