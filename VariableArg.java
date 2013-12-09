public class VariableArg{

	public static void main(String []args)
		{
		printMax(34,3,44,2,56,6);
		printMax(new double[]{1,2,3});
		}
	
	public static void printMax(double... numbers)
	{
	if(numbers.length==0)
		{
			System.out.println("No argument passes \n");
		return;
		}
	double result=numbers[0];
	
	for(double i:numbers)
	{
	if(i>result)
	{
	result=i;
	}
	}
	System.out.print("The max is " +result+"\n");
	}
}	
