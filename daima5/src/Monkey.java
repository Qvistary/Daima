class  Mammal{  //5-5
  private int n=40;
  void crySpeak(String s) {
   System.out.println(s);
  }
}
public class Monkey extends Mammal{   
void computer(int aa,int bb) {
int cc=aa*bb;
System.out.println(cc);
}
void crySpeak(String s) {
System.out.println("**"+s+"**");
}

public static void main(String args[]){
  Mammal mammal=new Monkey();  
  mammal.crySpeak("I love this game");
  Monkey monkey=(Monkey)mammal; 
  monkey.computer(10,10);
  }
}
