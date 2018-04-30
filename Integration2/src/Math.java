import java.util.Scanner;
public class Math {
	
 private Scanner reader;

public void divison() {
   reader = new Scanner(System.in);
   System.out.println("Enter a number to be cut in half: ");
   int numerator = reader.nextInt();
   int b = numerator / 2;
   System.out.println(numerator + "cut in half equals " + b);
   
	
	}

}