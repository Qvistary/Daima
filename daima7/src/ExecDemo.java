public class ExecDemo//7-11
{

    public static void main(String[] args)
    {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
            Thread.sleep(1000);
            p.destroy();

        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }

    }
}