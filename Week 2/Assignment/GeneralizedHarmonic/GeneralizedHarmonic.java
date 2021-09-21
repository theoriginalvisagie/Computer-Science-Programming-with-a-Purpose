public class GeneralizedHarmonic
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        double j = 0;
        double k = 0;
        double m = 0;

        for(int i = 1; i<=n; i++)
        {
            j = Math.pow(i,r);//4
            j = 1/j;//1/4
            k = j;
            m = k + m;
        }
        System.out.println(m);

    }
}