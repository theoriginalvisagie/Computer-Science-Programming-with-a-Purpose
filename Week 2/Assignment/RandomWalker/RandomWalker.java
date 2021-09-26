public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int md = x + y;
        double probability;
        int steps = 0;

        System.out.print("(" + x + ", " + y + ")\n");

        while (md != r){
            double random = Math.random();
            if (random < 0.25) {
                x++;
            }
            else if (random < 0.5) {
                x--;
            }
            else if (random < 0.75) {
                y++;
            }
            else if (random < 1.00) {
                y--;
            }
            md = Math.abs(x) + Math.abs(y);
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps =" + steps);
    }
}
