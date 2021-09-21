public class PQfor
{
    public static void main(String[] args)
    {
        int f = 0, g = 1;
        for (int i = 0; i <= 20; i++)
        {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
} 