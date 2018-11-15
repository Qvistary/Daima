class MyoneException extends Exception {//8-7
}
public class TryInbed {
  public static void main(String[] args) {
    System.out.println("Entering first try block");
    try {
      System.out.println("Entering second try block");
      try {
        throw new MyoneException();
      } finally {
        System.out.println("finally in 2nd try block");
      }
    } catch (MyoneException e) {
      System.err.println("Caught MyoneException in 1st try block");
    } finally {
      System.err.println("finally in 1st try block");
    }
  }
}
