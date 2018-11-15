 public class GroupTwo{//5-12
        private int count;    
        public class Student {    
          String name;
          public Student(String n1) {
           name=n1;
           count++;   
          }
         public void Output(){
           System.out.println(this.name);
          }
         }
      public void output(){ 
         Student s1=new Student("Johnson");   
         s1.Output();
         System.out.println("count="+this.count);
      }
    public static void main(String args[]){
       GroupTwo g2=new GroupTwo();
       g2.output();
    }
    }
