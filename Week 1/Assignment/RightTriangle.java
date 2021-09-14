public class RightTriangle {
  
    public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double aa = Math.pow(a, 2);
		double bb = Math.pow(b, 2);
		double cc = Math.pow(c, 2);

		boolean isPositive = a > 0 && b > 0 && c > 0;
		boolean isRight = isPositive && (aa + bb == cc ) || (aa + cc == bb) || (cc + bb == aa);
		System.out.println(isRight);

    }
}