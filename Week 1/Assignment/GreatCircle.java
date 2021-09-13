public class GreatCircle {
     public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double x2 = Math.toRadians(Double.parseDouble(args[1]));
        double y1 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double rConstant = 6371.0;

        double sinX = Math.pow(Math.sin((x2-x1)/2),2);
        double sinY = Math.pow(Math.sin((y2-y1)/2),2); 
        double middleCalc = sinX + Math.cos(x1)*Math.cos(x2)*sinY;
        double distance = 2*Math.asin(Math.min(1,Math.sqrt(middleCalc)));

        distance = Math.toDegrees(distance);
        distance = distance * 60;        

        System.out.println(distance*1.8);

     }
}
  
   