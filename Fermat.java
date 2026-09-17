import java.util.Scanner;
public class Fermat{	
public static void main(String[] args){
		
	Scanner scanner = new Scanner(System.in);
	boolean trueOrFalse= false;
	while(trueOrFalse==false){
	System.out.println("Enter value for a:");
	int a = scanner.nextInt();
	System.out.println("Enter value for b:");
	int b =scanner.nextInt();
	System.out.println("Enter value for c:");
	int c = scanner.nextInt();
	System.out.println("Enter value for n:");
	int n = scanner.nextInt();
	 trueOrFalse= test(a,b,c,n);
	if(trueOrFalse) System.out.println("Holy smokes, Fermat was wrong!");
	if(!trueOrFalse) System.out.println("No, that doesn't work");
	}
		}



public static boolean test(int a, int b, int c, int n){	
	
if((Math.pow(a,n) + Math.pow(b,n) )== Math.pow(c,n)&&n>2){
	return true;
	}
else return false;
	
	}
	
}
