public class ToString//7-4
{
    public static void main(String[] args)
    {
        int i = -34567;
        String s = null;
        System.out.println("2进制字符串:" + Integer.toBinaryString(i));
        System.out.println("8进制字符串:" + Integer.toOctalString(i));
        System.out.println("16进制字符串:" + Integer.toHexString(i));
        s = Integer.toString(i, 8);
        System.out.println("带符号8进制字符串:" + s);
        Integer I = Integer.valueOf(s, 8);
        System.out.println("Integer对象中的值："+I.intValue());
    }
}