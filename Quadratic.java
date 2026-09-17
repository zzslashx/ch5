import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		double a=0.0;
		double b=0.0;
		double c=0.0;
		System.out.println("Give the value for a:");
		a = scanner.nextDouble();
		System.out.println("Give the value for b:");
		b = scanner.nextDouble();
		System.out.println("Give the value for c:");
		c = scanner.nextDouble();
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("There are infinitely many answers");
				} else {
					System.out.println("There is no answer");
				}
			} else {
				System.out.printf("x=%.2f", -c / b);
			}
		}
		else if ((Math.pow(b, 2) - 4 * a * c) < 0) {
			System.out.println("There is no answer");
		}
		else if ((Math.pow(b, 2) - 4 * a * c) == 0) {
			System.out.printf("x=%.2f", quadratic1(a, b, c));
		}
		else {
			System.out.printf("x=%.2f and %.2f",
				quadratic1(a, b, c), quadratic2(a, b, c));
		}
		
		}
	public static double quadratic1(double a, double b, double c)	{
		
		return ((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
		
		}
		public static double quadratic2(double a, double b, double c)	{
		
		return ((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
		
		}
	}
