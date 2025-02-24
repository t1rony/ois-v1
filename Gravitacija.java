public class Gravitacija {
	public static final double C = 6.674 * Math.pow(10, -11);
	public static final double M = 5.972 * Math.pow(10, 24);
	public static final double MASA_ZEMLJE = 6.371 * Math.pow(10, 6);

	public static double gravitacija(double visina) {
		return C * M / Math.pow(MASA_ZEMLJE * visina, 2);
	}

	public static void main(String[] args) {
		System.out.println("OIS je zakon!");
	}
}