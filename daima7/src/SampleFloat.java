public class SampleFloat//7-2
{

    public static void main(String[] args)
    {
        float f = 3.1415f;
        double d = 3.14159267;
        Float F = new Float(f);
        Double D = new Double(d);
        System.out.println(F.toString());
        System.out.println(D.toString());
        f = F.floatValue();
        d = D.doubleValue();
        System.out.println(f);
        System.out.println(d);
        //±È½Ï
        System.out.println(D.equals(F));

    }
}