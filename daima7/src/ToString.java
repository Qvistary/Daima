public class ToString//7-4
{
    public static void main(String[] args)
    {
        int i = -34567;
        String s = null;
        System.out.println("2�����ַ���:" + Integer.toBinaryString(i));
        System.out.println("8�����ַ���:" + Integer.toOctalString(i));
        System.out.println("16�����ַ���:" + Integer.toHexString(i));
        s = Integer.toString(i, 8);
        System.out.println("������8�����ַ���:" + s);
        Integer I = Integer.valueOf(s, 8);
        System.out.println("Integer�����е�ֵ��"+I.intValue());
    }
}