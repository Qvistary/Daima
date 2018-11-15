public class Elapsed//7-7
{

    public static void main(String[] args)
    {
        long start, end, sum = 0,times =100000000; 
        System.out.println("执行"+times+"次循环需要的时间");
        start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            sum = sum + i * i;
        }
        end = System.nanoTime();
        System.out.println("需要的时间是" + (end - start) + "纳秒");

    }
}