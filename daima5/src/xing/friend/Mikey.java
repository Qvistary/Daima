package xing.friend;//5-2
import xing.house.HouseHold;
public class Mikey extends HouseHold { 
  public Mikey(){
   super("Star flight street 110");
  }
public static void main(String args[]){
  Mikey mikey=new Mikey();

  mikey.surnname="Math"; 
  mikey.address="Star flight street 110"; 
  String m=mikey.getAddress(); 
  System.out.println(mikey.surnname+"£º"+m);
  }
}
