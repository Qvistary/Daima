package daima4;//4-7
class koB{
   static int a;
   public void display(){
   System.out.print(" a="+a);
  }
 }
 public class classVar{
      public static void main(String args[]){
       koB a1=new koB(); a1.a=10;
       koB a2=new koB(); a2.a=20;
       koB.a=50;
       a1.display();  a2.display();
     }
}
