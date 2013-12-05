public class Characterclass {
	public static void main(String args[])
		{
		Character ch = 'a';
		if(Character.isLetter(ch))
		{

		System.out.print("It is a letter\n");
	         }
	else if(Character.isDigit(ch))
		{
			System.out.print("It is a digit\n");
		}
		else
		{
		System.out.print("It is neither a digit nor a letter\n");
		}
		}
	}
