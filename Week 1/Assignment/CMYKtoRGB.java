public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1 - black;
        double red = Math.round(255*white*(1-cyan));
        double green = Math.round(255*white*(1-magenta));
        double blue = Math.round(255*white*(1-yellow));

        int redInt = (int) red;
        int blueInt = (int) blue;
        int greenInt = (int) green;


        System.out.println("red = " + redInt);
        System.out.println("green = " + greenInt);
        System.out.println("blue = " + blueInt);
    }

}