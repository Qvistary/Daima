public class Elapsed//7-7
{

    public static void main(String[] args)
    {
        long start, end, sum = 0,times =100000000; 
        System.out.println("ִ��"+times+"��ѭ����Ҫ��ʱ��");
        start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            sum = sum + i * i;
        }
        end = System.nanoTime();
        System.out.println("��Ҫ��ʱ����" + (end - start) + "����");

    }
}