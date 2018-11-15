public class ArrayCopyDemo//7-8
{
    static byte a[] = { 65, 66, 67, 68, 69, 70, 71  };

    static byte b[] = { 88, 88, 88, 88, 88, 88, 88, 88, 88, 88 };

    public static void main(String[] args)
    {
        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println("b = " + new String(b));
        System.arraycopy(a, 0, a, 1, a.length - 1);
        System.arraycopy(b, 1, b, 0, b.length - 1);
        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));

    }
}