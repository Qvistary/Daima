
import java.util.ArrayList;
import java.util.LinkedList;//7-18

public class LinkedListDemo
{

    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        System.out.println("List�ĳ�ʼ��С: " + ll.size());
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add(0, "A2");
        System.out.println("����Ԫ����Ĵ�С: " + ll.size());
        System.out.println("List�е�����: " + ll);
        ll.remove("D");
        ll.remove(2);
        System.out.println("�Ƿ����Ԫ��D��" + ll.contains("D"));
        ArrayList al = new ArrayList(ll);
        ll.clear();
        System.out.println("al�Ƿ�Ϊ�գ�" + ll.isEmpty());
        ll.addAll(al);
        System.out.println("List�е�����: " + ll);
        ll.addFirst("A3");
        ll.addLast("A4");
        System.out.println("List�е�����: " + ll);

    }
}