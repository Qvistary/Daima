import java.util.ArrayList;//7-16
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        System.out.println("List的初始大小: " + al.size());
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add(1, "A2");
        System.out.println("增加元数后的大小: " + al.size());
        System.out.println("List中的内容: " + al);
        al.remove("D");
        al.remove(2);
        System.out.println("删除元素后的大小：" + al.size());
        System.out.println("内容: " + al);
    }
}