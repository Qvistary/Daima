import java.util.ArrayList;//7-16
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        System.out.println("List�ĳ�ʼ��С: " + al.size());
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add(1, "A2");
        System.out.println("����Ԫ����Ĵ�С: " + al.size());
        System.out.println("List�е�����: " + al);
        al.remove("D");
        al.remove(2);
        System.out.println("ɾ��Ԫ�غ�Ĵ�С��" + al.size());
        System.out.println("����: " + al);
    }
}