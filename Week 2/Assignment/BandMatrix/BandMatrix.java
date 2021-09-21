public class BandMatrix
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for(int row = 1; row<=n; row++)
        {
            for(int column = 1; column<=n; column++)
            {
                    
                if(Math.abs(n - (n - column + row)) <= width)
                {
                    System.out.print("* ");
                }   
                else
                {
                    System.out.print("0 ");
                }    
            }
            System.out.println("");
        }       
    }
}