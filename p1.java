import java.util.Scanner;
public class p1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float sizeofside;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter sizeofside : ");
		sizeofside = input.nextFloat();
		System.out.println("area of square is : "+(sizeofside * sizeofside));		
	}

}
