public class GreatCircle {
     public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

         double p1 = ((x2 - x1) / 2);
         double p2 = ((y2 - y1) / 2);
         double r = 2 * 6371.0;

         double hav = Math.asin(Math.sqrt((Math.sin(p1) * Math.sin(p1)) + Math.cos(x1) * Math.cos(x2) *(Math.sin(p2) * Math.sin(p2))));

         double dist = r * hav;

         System.out.print(dist + " kilometers");

     }
}
  
   