public class Ruler
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        String ruler = " ";
        for (int i = 1; i <= N; i++)
            ruler = ruler + i + ruler;
        System.out.println(ruler);
    }
}

//C:\Users\Christiaan\Documents\GitHub\Computer-Science-Programming-with-a-Purpose\Week 2\Ruler