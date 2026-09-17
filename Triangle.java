import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
	    double a = 1.0;
	    double b = 1.0;
	    double c = 1.0;
	    System.out.println("Give first side length of triangle");
	    a = scanner.nextDouble();
	      if (a<=0.0 || b <=0.0 || c <=0.0 ){
			   System.out.println("Side length cannot be less than or equal to 0 --> restart");      
			   return;
		   }
	    System.out.println("Give second side length of triangle");
	    b = scanner.nextDouble();
	     if (a<=0.0 || b <=0.0 || c <=0.0 ) {
	     System.out.println("Side length cannot be less than or equal to 0 --> restart");
	     return;
	 }
	    System.out.println("Give third and final side length of triangle");
	    c = scanner.nextDouble();
	     if (a<=0.0 || b <=0.0 || c <=0.0 ) {
			 System.out.println("Side length cannot be less than or equal to 0 --> restart");
		return;
	}
		if((a+b)>c && (a+c)>b && (b+c)>a) System.out.println("A triangle can be made!");
		else System.out.println("A triangle cannot be made!");
		}
	}
