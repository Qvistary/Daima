class MyotherException extends Exception {//8-8
  public MyotherException() {
  }
  public MyotherException(String msg) {
    super(msg);
  }
}

public class Exception8 {
  public static void f() throws MyotherException {
    System.out.println("Throwing MyotherException from f()");
    throw new MyotherException();
  }
  public static void g() throws MyotherException {
    System.out.println("Throwing MyotherException from g()");
    throw new MyotherException("Originated in g()");
  }
  public static void main(String[] args) {
    try {
      f();
    } catch (MyotherException e) {
      e.printStackTrace();
    }
    try {
      g();
    } catch (MyotherException e) {
      e.printStackTrace();
    }
  }
}

