public class BooleanDemo//7-6
{
    public static void main(String[] args)
    {
        String s = "true";
        boolean b = true;
        if (b == new Boolean(s).booleanValue()) {
            System.out.println("两个布尔变量相等");
        }
        System.out.println(Boolean.valueOf(s).hashCode());
    }
}