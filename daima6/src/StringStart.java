public class StringStart{//6-1
  public static void main(String args[]){
  String john="200400581",start="2004";
  if((john.startsWith(start)) && (john.endsWith("1")))
    System.out.println("该生是2004级男学生");
  else
    System.out.println("该生不是2004级男学生");
 }
}
