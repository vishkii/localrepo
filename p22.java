/*  if first character is capital return true,
 * otherwise false
 */
import java.util.Scanner;
public class p22 {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String a;
		char b;
		a = scan.next();
		b = a.charAt(0);
		
		isFirstCharCaps(b);
		
		}
	public static  char isFirstCharCaps(char input) 
	{
		if(Character.isUpperCase(input))
		{
			System.out.println("true"); 
		}
		else
		{
			System.out.println("false");
		}
		return input;
		
			
	}
	
}
