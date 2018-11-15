public class CovertString//6-7
{
  public static void main(String args[])
  {
int nInt = 10;
float fFloat = 3.14f;
double dDouble = 3.1415926;
Integer obj1 = new Integer(nInt);
Float obj2= new Float(fFloat);
Double obj3 = new Double(dDouble);
String strString1 = obj1.toString();
System.out.println(strString1);
String strString2 = obj2.toString();
System.out.println(strString2);
String strString3 = obj3.toString();
System.out.println(strString3);
  }
}
