 abstract class AA{//5-8
      abstract void callme( );
      void metoo( ){
         System.out.println("InsideA's metoo() method  ");
      }
    }
    class BB extends AA{
     void callme( ){
       System.out.println("Inside B's callme() method  ");
     }
    }
    public class AAbstract{
    public static void main(String args[]){
      AA cc=new BB();
      cc.callme();
      cc.metoo();
 }
}