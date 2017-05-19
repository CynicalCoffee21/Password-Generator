import java.util.Random;
import java.util.Scanner;

public class Generator {
	/** Capital Letters */
	public final static String alphaCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	/** Lower Case Letters */
	public final static String alphaLow = "abcdefghijklmnopqrstuvwxyz";
	/** Symbols */
	public final static String symbols = "!@#$%^&*.,<>?~-";
	
	public static void main(String[] args) {
		System.out.println("Enter the desired length of your new password: ");
		
		Scanner in = new Scanner(args[0]);
		int L = in.nextInt();
		
		String newPass = "";
		
		char[] A = alphaCap.toCharArray();
		char[] a = alphaLow.toCharArray();
		char[] S = symbols.toCharArray();
		
		Random r= new Random();
		
		for(int i = 0; i <= L-1; i++){
			int choice = r.nextInt(3);
			
			if(choice == 0){//If the random number coincides with the Capital Letters.
				newPass += A[r.nextInt(25)];
			} else if(choice == 1){//If the random coincides with lower case letters.
				newPass += a[r.nextInt(25)];
			} else if (choice == 2){ // If the random coincides with the symbols.
				newPass += S[r.nextInt(14)];
			}	
			
		}
		System.out.println(newPass);
		in.close();
	}

}
