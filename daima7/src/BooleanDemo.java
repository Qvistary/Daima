public class BooleanDemo//7-6
{
    public static void main(String[] args)
    {
        String s = "true";
        boolean b = true;
        if (b == new Boolean(s).booleanValue()) {
            System.out.println("���������������");
        }
        System.out.println(Boolean.valueOf(s).hashCode());
    }
}