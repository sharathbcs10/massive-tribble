import java.util.Scanner;
import java.io.*;
public class Readinput{
	
	public static void main(String []args)
		
	{
		Scanner in=new Scanner(System.in);
		 System.out.print("Enter a string\n");
                 String name=in.nextLine(); /*to read a string */

		System.out.print("Enter an integer\n");
		int num=in.nextInt(); /*To read an integer from the console */
		System.out.print("Enter a character\n");
        char c = in.next().charAt(0); /*to read a character from the console */

		in.close();
		
		System.out.print(num + " " + name + " " + c +"\n");
	}
}
